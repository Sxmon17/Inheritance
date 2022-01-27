public abstract class Writeable extends ReadOnly {
    public Writeable(String name, long capacity) {
        super(name, capacity);
    }
    public void write(int start, byte[] newData){
        for (int i = start; i < newData.length; i++) data[i] = newData[i];
    }
}
