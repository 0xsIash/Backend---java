public class Alphabet{
    private char ch;

    public Alphabet(char ch){
        this.ch = ch;
    }

    public char nextChar(){
        if (ch == 'z'){
            return 'a';
        }
        return (char) (ch+1);
    }
}