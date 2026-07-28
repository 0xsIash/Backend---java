public class Pum{
    private final int  num;
    public Pum(int n){
        num = n;
    }
    public void print(){
        for (int i=1;i<=num*4;i++){

            if(i%4!=0){
                System.out.print(i+" ");
            }
            else if (i==num*4){
                System.out.print("PUM");
            }
            else {
                System.out.println("PUM");
            }

        }
    }
}