package Examples;
import java.util.Scanner;

public class amicableNum {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number:");
        int firstNum= sc.nextInt();
        System.out.print("Enter second number:");
        int secondNum= sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1; i<firstNum; i++)
        {
            if(firstNum%i==0){
                sum1+=i;
            } 
        }
        for(int j=1; j<secondNum; j++)
        {
            if(secondNum%j==0){
                sum2+=j;
            }
        }
        if(sum1==secondNum && sum2==firstNum)
        {
            System.out.print("Ampicable numbers!");
        }
        else{
            System.out.println("Something went wrong");
        }
    }
}