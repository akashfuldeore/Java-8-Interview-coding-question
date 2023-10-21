import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyofeachChar {
    public static void main(String[] args) {
        String characterstring = "java 8 stream api code for find the frequency of character";

        Map<Character, Long> charinstring = characterstring.chars().
                mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charinstring);
    }
}
