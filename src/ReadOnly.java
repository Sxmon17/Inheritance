public abstract class ReadOnly {
    static byte[] data;
    double bitfehlerrate;
    String name;
    long capacity;

    public ReadOnly(String name, long capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public byte[] read(int start, int length){
        return data;
    }
    public int getCapacity(){
        return 0;
    }
    double getBitfehlerrate(){
        return 0;
    }
}
