public class  DataType{
    private long n;
    private long k;
    private long a;

    public DataType(long n,long k,long a){
        this.n = n;
        this.k = k;
        this.a = a;
    }

    public String Guessing(){
        if ((n*k)%a!= 0){
            return ("double");
        }
        long ans = (n*k)/a;
        if (ans <= Integer.MAX_VALUE){
            return ("int");
        }
        else{
            return ("long long");
        }
    }
}
