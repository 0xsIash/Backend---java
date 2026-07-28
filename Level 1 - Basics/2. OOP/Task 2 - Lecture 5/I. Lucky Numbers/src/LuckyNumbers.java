public class LuckyNumbers{
    private int num;

    public LuckyNumbers(int n){
        num = n;
    }

    public void print(){
        int leftDigit = num/10;
        int rightDigit = num%10;

        if (leftDigit == 0 || rightDigit == 0||leftDigit % rightDigit == 0 || rightDigit % leftDigit == 0 ){
            System.out.print("YES");
        }

        else{
            System.out.print("NO");
        }

    }
}