interface A{
  public  void print();// interface method (does not have a body)

}
interface B{
    void show();// interface method (does not have a body)
}
class C implements A,B{
   public void print(){
        System.out.println("printing");
    }
    public void show(){
        System.out.println("show");
    }
}
public class interface1 {
    public static void main(String[] args) {
        C c=new C();
        c.print();
        c.show();
    }
   
}
