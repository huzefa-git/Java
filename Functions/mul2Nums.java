import java.util.Scanner;
public class mul2Nums {
    public static int multiply(int a,int b){
        int multiply = a*b;
        return multiply;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = multiply(a, b);
        System.out.println("The product of two numbers is: "+multiply);
    }
}
