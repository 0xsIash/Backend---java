public class SayHello{
    private String name;

    SayHello(String name){
        this.name = name;
    }
    public void print(){
        System.out.print("Hello, "+name);
    }
}