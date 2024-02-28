import java.util.Scanner;

public class romanToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0, answer = 0, prev = Integer.MIN_VALUE;
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.charAt(i)) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
            }
            if (number < prev) {
                answer -= number;
            } else{
                answer += number;
            }
            prev = number;
        }
        System.out.println(answer);
    }
}
