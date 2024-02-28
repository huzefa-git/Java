package Examples;
import java.util.AbstractCollection;
abstract class bike{
    abstract void run();
}
class honda extends bike{
    void run(){
        System.out.println("Bike is running");
    }
    public static void main(String args[]){
        bike obj = new honda();
        obj.run();
    }
}
