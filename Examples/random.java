package Examples;
import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        int guess= -1, bound;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bound:");
        bound = sc.nextInt();
        int num = random.nextInt(bound);
        while(true){
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            if(guess<num){
                System.out.println("Too low,Try again!");
            }
            else if (guess>num) {
                System.out.println("Too high,Try again!");
            }
            else{
                System.out.println("You Guessed it Right!");
                break;
            }
        } 
    }
    
}
