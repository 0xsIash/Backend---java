import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Question4 {
    public void main(String[] args){
        String sentence = "Java Spring Java Hibernate Spring Java";

        Map<String,Long> res = Arrays.stream(sentence.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));

        res.forEach((word,count)->
                        System.out.println(word+": "+count)
                );

    }
}
