public class Numbers{
    private final int num;

    public Numbers(int n){
        num = n;
    }

    public void print(){
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}
