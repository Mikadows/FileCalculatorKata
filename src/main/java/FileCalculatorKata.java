import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Horrible code to refactor
 */
public class FileCalculatorKata {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("numbers.txt"), StandardCharsets.UTF_8);
        int sum = 0;
        for ( String s : lines) {
            sum += Integer.parseInt(s);
            System.out.println(sum);
        }
    }
}
