package zemoso;
import java.util.Map;
import java.util.stream.Collectors;

public class Vowel {

        public static void main(String[] args) {
            String str = "Hello World";

            Map<Character, Long> collect = str.toLowerCase().chars().mapToObj(
                    c -> (char) c).filter(c -> "aeiou".contains(c + "")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
            System.out.println(collect);
        }

}
