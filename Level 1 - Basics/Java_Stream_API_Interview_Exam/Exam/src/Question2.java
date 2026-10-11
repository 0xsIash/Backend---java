import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question2 {
    public void main(String[] args){
        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);


        List<Integer> nums = numbers.stream().filter(n->numbers.stream().filter(num -> num == n).count()>1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nums);
    }
}
