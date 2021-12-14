// package java_engineering;


final class RR {
    public static void main(String[] args)
    {
        int a = 10;
    }
}
// here gets Compile time error that
// we can't extend RR as it is final.
class KK extends RR {
    // more code here with main method
}
class QQ {
    final void rr() {}
    public static void main(String[] args)
    {
    }
}
  
class MM extends QQ {
  
    // Here we get compile time error
    // since can't extend rr since it is final.
    void rr() {}
}

public class final1 {
    public static void main(String[] args)
    {
        // Non final variable
        int a = 5;
  
        // final variable
        final int b = 6;
  
        // modifying the non final variable : Allowed
        a++;
  
        // modifying the final variable : 
        // Immediately gives Compile Time error.
        b++;
    }
    
}
