public class Calculator {
    private int a;
    private char s;
    private int b;
    private String expression;

    Calculator(String expression){
        this.expression = expression;
    }

    public void devide(){
        for (int i=0; i<expression.length();i++){
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/'){
                a = Integer.parseInt(expression.substring(0,i));
                s = expression.charAt(i);
                b = Integer.parseInt(expression.substring(i+1));
            }
        }
    }

    public void calc(){
        devide();
        switch (s){
            case'+':
                System.out.print(a+b);
                break;
            case'-':
                System.out.print(a-b);
                break;
            case'*':
                System.out.print(a*b);
                break;
            case'/':
                System.out.print(a/b);
                break;
        }
    }
}
