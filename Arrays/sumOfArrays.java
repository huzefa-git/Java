import java.util.Scanner;
public class sumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the array elements");
        int sum=0;
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
