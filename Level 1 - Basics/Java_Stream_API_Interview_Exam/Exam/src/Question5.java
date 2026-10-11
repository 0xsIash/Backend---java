import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question5 {
    public void main(String[] args){
        List<String> words = Arrays.asList(
                "Java", "SpringBoot", "Microservices",
                "Hibernate", "Docker"
        );

        String word = words.stream()
                .reduce((a,b) ->a.length() >= b.length() ? a:b)
                .orElse(null);

        System.out.println(word);


    }
}
