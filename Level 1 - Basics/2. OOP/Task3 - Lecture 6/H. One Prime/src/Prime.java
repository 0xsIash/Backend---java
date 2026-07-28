public class Prime{
    private final int num;

    public Prime(int n){
        num = n;
    }

    public void print(){
        if (num == 1){
            System.out.print("NO");
            return;
        }

        boolean isPrime = true;

        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
