import java.util.Scanner;
import java.math.*;

public class Circumference {
    public static void circumference(int r) {
        System.out.println("The Circumference of circle is " + 2 * Math.PI * r);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle : ");
        int radius = sc.nextInt();
        circumference(radius);
    }
}
