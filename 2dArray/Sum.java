import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int sum = 0;
        int avg = 0;
        int numbers[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
                sum += numbers[i][j];
            }
        }
        avg+=sum/(rows*cols);
        System.out.println(sum);
        System.out.println(avg);
    }
}