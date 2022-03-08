import javax.swing.event.SwingPropertyChangeSupport;

class A{
    int a=5;
}
class B extends  A{
    int a=10;
    
    void print(){
    System.out.println(this.a+" "+super.a);
}
}
public class superA {
    public static void main(String[] args) {
        B b=new B();
        b.print();
    }
    
}
