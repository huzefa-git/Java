import java.util.Scanner;
import java.lang.Math;
public class Power {
    public static int power(int x,int n){
        System.out.println("The value is: "+Math.pow(x, n));
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        power(x, n);
    }   
}
