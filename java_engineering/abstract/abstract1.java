abstract class A{
    abstract void run();
    void go(){
        System.out.println("went");
    }
}
class B extends A{
    void run(){
        System.out.println("run");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        // A a=new A();//A is abstract; cannot be instantiated
        B b=new B();
         A a=new B();       //In a real scenario, object is provided through method, e.g., getShape() method  

        b.run();
        b.go();
        a.run();
        a.go();
    }
    
}
