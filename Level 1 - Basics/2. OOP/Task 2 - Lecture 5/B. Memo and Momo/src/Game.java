public class Game{
    private long memo;
    private long momo;
    private long k;

    public Game(long a,long b,long k){
        memo = a;
        momo = b;
        this.k = k;
    }

    public void winner(){
        boolean check_memo = (memo%k) == 0;
        boolean check_momo = (momo%k) == 0;

        if (check_memo && check_momo){
            System.out.print("Both");
        }

        else if (check_memo){
            System.out.print("Memo");
        }
        else if (check_momo){
            System.out.print("Momo");
        }
        else{
            System.out.print("No One");
        }
    }

}