package Examples;
import java.util.Scanner;

public class PatternD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        if (size < 0) {
            System.out.println("Size should be a non-negative integer.");
        } else {
            printTriangularPatternD(size);
        }
    }

    public static void printTriangularPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}

