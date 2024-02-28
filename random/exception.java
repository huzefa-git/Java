import java.util.Scanner;
public class exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=30;
        int b=0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by zero");
        }
        finally{
            System.out.println("This is executed anyway!");
        }
    }
}
