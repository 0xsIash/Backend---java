public class Bits{
    private long a;
    private long b;

    public Bits(long a,long b){
        this.a = a;
        this.b = b;
    }

    public long addingBits(){
        return a^b;
    }
}