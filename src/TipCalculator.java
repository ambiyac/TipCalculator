import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How many people are in your group: ");
        int group = scan.nextInt();
        scan.nextLine();
        System.out.print("What is the tip percentage?(0-100): ");
        int tipPercentage = scan.nextInt();


        double cost = scan.nextDouble();

        while (cost != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g 12.50 (-1 to end): ");
        }




    }
}
