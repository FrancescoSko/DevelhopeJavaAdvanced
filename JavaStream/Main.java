package JavaAdvanced.JavaStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            Stream<String> lines = Files.lines(Paths.get("C:\\Users\\franc\\Desktop\\testo.txt"));

            for (String line : lines.toList()) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
