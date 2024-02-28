import java.util.Arrays;
import java.util.Scanner;

public class SiriPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] series = new int[n / 2];
        series[0] = 3;
        series[1] = 6;
        for (int i = 2; i < n / 2; i++) {
            series[i] = series[i - 1] + series[i - 2];
            if(series[i]==n){
                System.out.println("YES");
            }else{
                if(series[i]>n){
                    System.out.println("NO");
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(series));
    }
}
