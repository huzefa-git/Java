import java.util.Scanner;

public class Voter {
    public static int voter(int age){
        if(age>=18){
            System.out.println("You are eligible to vote!");
        }else{
            System.out.println("Nah! You can't vote");
        }
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter your Age: ");
        int age = sc.nextInt();
        voter(age);
    }   
}
