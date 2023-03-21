import java.util.stream.IntStream;

public class PangramChecker {

    public boolean isPangram(String input) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return IntStream.range(0, alphabet.length).mapToObj(i -> alphabet[i])
                .allMatch(letter -> input.toLowerCase().contains(letter.toString()));
    }

}
