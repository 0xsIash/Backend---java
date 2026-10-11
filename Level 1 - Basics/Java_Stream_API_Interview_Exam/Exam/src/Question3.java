import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question3 {
    public void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 5, 20, 20, 8, 15, 10);
        int num = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(num);
    }
}
