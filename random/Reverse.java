import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Random String");
        String name = sc.next();
        
        for(int i=name.length()-1;i>=0;i--)
        {   
            char name1 = name.charAt(i);
            System.out.print(name1);

        }
    }
}
