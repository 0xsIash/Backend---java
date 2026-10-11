public class Question1 {
    public void main(String[] args){
        String input = "swiss";
        Character result = input.chars().mapToObj(c -> (char) c)
                .filter(c->input.chars().filter(ch -> ch == c).count()==1)
                .findFirst()
                .orElse(null);
        System.out.println(result);
    }
}
