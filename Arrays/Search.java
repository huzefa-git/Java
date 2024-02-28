import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                System.out.println("The target is at: "+i);
            }
        }
    }
}
