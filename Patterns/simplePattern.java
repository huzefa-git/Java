import java.util.Scanner;

public class simplePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of Columns: ");
        int columns = sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
