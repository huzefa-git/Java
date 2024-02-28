package Examples;
import java.util.Scanner;

public class mulPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
    
}
