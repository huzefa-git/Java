package Examples;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size should be a positive integer.");
        } else {
            printMultiplicationTable(size);
        }
    }

    public static void printMultiplicationTable(int size) {
        // Print the header row with column numbers
        System.out.print("* |");
        for (int i = 1; i <= size; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        
        // Print the separator line
        System.out.print("--|");
        for (int i = 1; i <= size; i++) {
            System.out.print("---");
        }
        System.out.println();

        // Print the multiplication table
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " |");
            for (int j = 1; j <= size; j++) {
                System.out.print(" " + (i * j));
                if (i * j < 10) {
                    System.out.print(" "); // Add an extra space for single-digit numbers
                }
            }
            System.out.println();
        }
    }
}
