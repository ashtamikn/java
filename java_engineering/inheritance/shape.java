class shape1{
    int length;
    int breadth;
}
class t extends shape1{
    double area;
    t(int a,int b){
        super.length=a;
        super.breadth=b;
    }
    void print(){
        System.out.println(super.breadth*super.length);
    }
}
public class shape {
    public static void main(String[] args) {
        t a=new t(1,2);
        a.print();
    }
}
