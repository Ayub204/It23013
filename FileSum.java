import java.io.*;
import java.util.*;

public class FileSum {
    public static void main(String[] args) {
        File inputFile = new File("input29.txt");
        File outputFile = new File("output29.txt");

        try (Scanner scanner = new Scanner(inputFile);
             PrintWriter writer = new PrintWriter(outputFile)) {

            if (!scanner.hasNextDouble()) {
                System.out.println("File is empty or contains no numbers.");
                writer.println("No valid numbers found.");
                return;
            }

            double max = Double.MIN_VALUE, sum = 0;

            while (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                if (num > max) max = num;
                sum += num;
            }

            System.out.println("Highest Value: " + max);
            System.out.println("Sum: " + sum);

            writer.println("Highest Value: " + max);
            writer.println("Sum: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found!");
        }
    }
}
