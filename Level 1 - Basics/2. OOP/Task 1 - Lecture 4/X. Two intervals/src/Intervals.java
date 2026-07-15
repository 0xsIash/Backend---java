public class Intervals{
    private long l1;
    private long r1;
    private long l2;
    private long r2;

    Intervals(long l1,long r1,long l2,long r2){

        this.l1 = l1;
        this.r1 = r1;
        this.l2 = l2;
        this.r2 = r2;
    }

    public void print(){
        if(r1<l2 || l1>r2){
            System.out.print(-1);
        }

        else {
            System.out.println(Math.max(l1,l2)+" "+Math.min(r1,r2));
        }
    }
}
