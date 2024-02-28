import java.util.Scanner;

public class LenOfStrArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int totalLen=0;
        String str[] = new String[size];
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
            totalLen+=str[i].length();
        }
        System.out.println(totalLen);
    }
}
