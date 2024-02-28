import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Random String");
        String name = sc.next();
        String reversed = "";
        for(int i=name.length()-1;i>=0;i--)
        {   
            char name1 = name.charAt(i);
            System.out.print(name1);
            reversed+=name1;
        } 
        System.out.println(" ");
        if(name.equals(reversed)){
            System.out.println("Yes,It's a Palindrome");
        }
        else
        {
            System.out.println("No,Not a Palindrome");
        }  
    }
}
