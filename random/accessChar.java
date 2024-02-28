// import java.util.Scanner;

// public class accessChar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter elements:");
//         int n = sc.nextInt();
//         char[] alp = new char[n];
//         for(int i=0;i<n;i++)
//         {
//             char a = sc.next().charAt(0);
//             alp[i] = a;
//         }   
//         System.out.println("Accessed eles:");
//         for(int j =0;j<n;j++)
//         {
//             System.out.print(alp[j]+" ");
//         }
//     }
// }

import java.util.Scanner;

public class accessChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i=0;i<name.length();i++)
        {
            char words = name.charAt(i);
            System.out.println(words);
        }
    }
}