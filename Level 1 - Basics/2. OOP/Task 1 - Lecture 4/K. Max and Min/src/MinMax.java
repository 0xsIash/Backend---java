public class MinMax {
    private int num1;
    private int num2;
    private int num3;

    MinMax(int num1,int num2 ,int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void print(){
        int min = Math.min(num1,Math.min(num2,num3));
        System.out.print(min+" ");

        int max = Math.max(num1,Math.max(num2,num3));
        System.out.print(max);
    }
}
