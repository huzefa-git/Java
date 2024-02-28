import java.util.Scanner;

public class add2Nums {
    public static int addNums(int a,int b){
        int sum = a+b;
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addNums(a, b);
        System.out.print("Sum of two numbers is: "+sum);
    }

}
