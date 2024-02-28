import java.util.Scanner;

public class InputName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        String names[]= new String[size];
        System.out.println("Enter names: ");
        for(int i =0;i<size;i++){
            names[i] = sc.next();
        }
        System.out.println("The names are:");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}