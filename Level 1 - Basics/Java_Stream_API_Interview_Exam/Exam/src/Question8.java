import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
    public void main(String[] args){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 4);

        List<Integer> common = list1.stream()
                .filter(list1::contains)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(common);
    }
}
