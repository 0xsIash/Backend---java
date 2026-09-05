import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalMapFlatMap {
    public static void main(String[] args) {
        // ============================================================
        // 🔹 Optional, Map, FlatMap
        // ============================================================


        // ============================================================
        // 1. Flatten a list of lists into a single list.
        // ============================================================

//        List<List<String>> nestedWords = Arrays.asList(
//                Arrays.asList("Java", "Stream"),
//                Arrays.asList("API", "Lambda"),
//                Arrays.asList("FlatMap", "Map")
//        );
//
//
//        List<String> newList = nestedWords.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(newList);

        // ============================================================
        // 2. Extract all unique characters from a list of words.
        // ============================================================


//        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//
//        Function<String, Stream<Character>> getCharacters = name -> name.chars() .mapToObj(c -> (char) c);
//
//        List<Character> result = names.stream()
//                .filter(Objects::nonNull)
//                .flatMap(getCharacters)
//                .distinct()
//                .collect(Collectors.toList());
//
//        System.out.println(result);

        // ============================================================
        // 3. Filter a list of Optionals and collect non-empty values.
        // ============================================================

//        List<Optional<String>> names = Arrays.asList(
//                Optional.of("Ali"),
//                Optional.empty(),
//                Optional.of("Mona"),
//                Optional.empty(),
//                Optional.of("Ahmed")
//        );
//
//        List<String> result = names.stream()
//                .filter(Optional::isPresent)
//                .map(Optional::get)
//                .collect(Collectors.toList());
//
//        System.out.println(result);


        // ============================================================
        // 4. Map a list of strings to their lengths.
        // ============================================================

//        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//        Function<String, Integer> getLength = name -> name.length();
//
//        List<Integer> result = names.stream()
//                .filter(Objects::nonNull)
//                .map(getLength)
//                .collect(Collectors.toList());
//
//        System.out.println(result);

        // ============================================================
        // 5. Return a list of uppercased words that start with “A”.
        // ============================================================
//        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
//        Function<String,String> toUpperCase = new Function<String,String> (){
//            @Override
//            public String apply(String name){
//                if(name.startsWith("A")){
//                    return name.toUpperCase();
//                }
//                return name;
//            }
//        };
//
//        List<String> result = names.stream().filter(Objects::nonNull).map(toUpperCase).collect(Collectors.toList());
//        System.out.println(result);

    }
}
