import java.util.Locale;
import java.util.Scanner;

public class belowAverage {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int quantity;
        double addingTotal = 0.0;
        double averageNumbers = 0.0;

        // getting numbers
        System.out.print("How many numbers? ");
        quantity = scanner.nextInt();
        double[] numbers = new double[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextDouble();
        }

        // average calculation
        for (int i = 0; i < quantity; i++) {
            addingTotal += numbers[i];
        }
        averageNumbers = addingTotal/(double)quantity;

        // printing total and average numbers
        System.out.printf("Average numbers: %.3f%n", averageNumbers);
        System.out.println("Below average elements: ");
        for (int i = 0; i < quantity; i++) {
            if (numbers[i] < averageNumbers){
                System.out.printf("%.1f%n", numbers[i]);
            }
        }

    }
}
