package Examples;
public class parse {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int sum = a+b+c+d;
        int average = sum/5;
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+average);
    }
}
