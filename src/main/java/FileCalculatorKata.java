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
        String inputFile = args[0];
        String operation = args[1];

        List<String> lines = Files.readAllLines(Paths.get(inputFile), StandardCharsets.UTF_8);
        int sum = 0;
        if (operation.equals("*")) {
            sum = 1;
        }
        boolean firstLine = true;

        for ( String s : lines) {
            if (firstLine) {
                firstLine = false;
                System.out.println(s);
                sum += Integer.parseInt(s);
                continue;
            }
            switch (operation) {
                case "+":
                    sum += Integer.parseInt(s);
                    System.out.println(String.format("+%s (=%d)", s, sum));
                    break;
                case "*":
                    sum *= Integer.parseInt(s);
                    System.out.println(String.format("*%s (=%d)", s, sum));
                    break;
            }
        }
        if (operation.equals("+")) {
            System.out.println(String.format("-------\ntotal = %s (addition)", sum));
        } else {
            System.out.println(String.format("-------\ntotal = %s (multiplication)", sum));
        }
    }
}
