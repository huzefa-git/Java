import java.util.Scanner;

public class Symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of the original matrix:");
        System.out.print("Enter the number of Rows: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int cols1 = sc.nextInt();
        int matrix1[][] = new int[rows1][cols1];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the details of the trial matrix:");
        System.out.print("Enter the number of Rows: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int cols2 = sc.nextInt();

        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices are not of the same size. Symmetry not applicable.");
            return;
        }

        int matrix2[][] = new int[rows2][cols2];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        boolean isSymmetric = true;

        // Checking for symmetry
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if (matrix1[i][j] != matrix2[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric){
                break;
            }
        }
        if (isSymmetric){
            System.out.println("Matrices are Symmetric!");
        } else {
            System.out.println("Matrices are Not Symmetric!");
        }
    }
}
