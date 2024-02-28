package Examples;
    class A{
        public void printA(){
            System.out.println("Hello");
        }
    }
    class B extends A{
        public void printB(){
            System.out.println("Hey!");
        } 
    }
    public class singleInherit {
        public static void main(String args[]){
            A obj = new A();
            B obj1 = new B();
            obj.printA();
            obj1.printB();
        }
    
    
}
