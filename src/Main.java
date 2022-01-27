import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] newData = new byte[10000];
        for (int i = 0; i < newData.length; i++) {
            if(Math.random() < 0.5) {
                newData[i] = 1;
            }
        }
        //Flash
        FlashDrive flash = new FlashDrive("E:\\Flash", 15000);
        flash.write(0, newData);
        System.out.println("Data from 0 to 10: \n" + Arrays.toString(flash.read(0, 10)));
    }
}
