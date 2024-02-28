import java.util.Scanner;

public class Factorial {
    public int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * (factorial(number - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factorial obj = new Factorial();
        int number = sc.nextInt();
        int fun = obj.factorial(number);
        System.out.println(fun);
    }
}
