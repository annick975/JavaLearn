import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.print("Enter the temperature in degrees Celsius: ");
        int temperature = scanner.nextInt();

        // Check the temperature and give advice
        if (temperature > 30) {
            System.out.println("It's hot! Don't forget to drink plenty of water.");
        } else if (temperature >= 20 && temperature <= 30) {
            System.out.println("The weather is nice. Enjoy your day!");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's a bit cool. You might want to wear a light jacket.");
        } else if (temperature >= 0 && temperature < 10) {
            System.out.println("It's cold! Make sure to bundle up.");
        } else {
            System.out.println("It's freezing! Stay warm and be careful.");
        }

        // Close the scanner
        scanner.close();
    }
}
