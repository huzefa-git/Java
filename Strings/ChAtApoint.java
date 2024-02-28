// public class ChAtApoint {
//     public static void main(String[] args) {
//         String name = "Roronoa zoro";
//         System.out.println(name.charAt(0));
//     }
// }

import java.util.Scanner;

public class ChAtApoint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}