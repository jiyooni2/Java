import java.util.Optional;

public class Ch14_Optional {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);

    }
}
