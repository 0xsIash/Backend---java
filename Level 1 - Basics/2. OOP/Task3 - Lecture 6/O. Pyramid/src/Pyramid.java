public class Pyramid{
    private final int num;

    public Pyramid(int n){
        num = n;
    }

    public void print(){
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
