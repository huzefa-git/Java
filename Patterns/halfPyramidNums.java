import java.util.Scanner;

public class halfPyramidNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m = sc.nextInt();
        for(int i=1; i<=n ;i++){
            
            for(int j=1; j<i ;j++){
                System.out.print(j);
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
