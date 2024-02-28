import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = sc.nextLine();
        System.out.println("Enter second name:");
        String secondName = sc.nextLine();
        if(firstName.compareTo(secondName)>0){
            System.out.println("String 1 is greater than string 2");
        }else if(firstName.compareTo(secondName)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String 1 is smaller than string 2");
        }

    }
}
