package Examples;
public class exception {
    public static void main(String args[]){
        try{
            int a=30,b=10;
            int c=a/b;
            System.out.println("result="+c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't devide a number with zero!");
        }
    }
    
}
