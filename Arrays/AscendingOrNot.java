import java.util.Scanner;

public class AscendingOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true; // Assume the array is initially sorted

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isAscending = false; // If any pair is not in ascending order, set the flag to false
                break; // No need to continue checking once a pair is out of order
            }
        }
        
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("Not sorted in ascending order");
        }
    }
}
