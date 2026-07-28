public class Matryoshka {
    private long n;
    private long m;
    private long k;

    public Matryoshka(long n, long m, long k){
        this.n=n;
        this.m=m;
        this.k=k;
    }

    public long Katryoshka(){
        long type3 = Math.min(n,Math.min(m,k));

        n-=type3;
        m-=type3;
        k-=type3;

        long type1 = Math.min(n/2,k);
        return (type1+type3);
    }

}