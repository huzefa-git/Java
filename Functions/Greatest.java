import java.util.Scanner;

public class Greatest {
    public static int greater(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greater(a, b);
    }
}
