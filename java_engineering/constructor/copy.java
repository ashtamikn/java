// import javax.swing.Box;

// package java_engineering.constructor;


 class box {
    double length,breadth,height;
    box(int a,int b,int c){
       length=a;
       breadth=b;
       height=c;
    }
    box(box c){
        length=c.length;
        breadth=c.breadth;
        height=c.height;
    }
    
}
public class copy{
    public static void main(String[] args) {
        box  k=new box(1,2,3);
        box l=new box(k);
        System.out.println(k.breadth+" "+k.height+" "+k.length);
        System.out.println(l.breadth+" "+l.height+" "+l.length);
        for(String i:args)
        {
            System.out.println(i);
        }

  }
  
}
