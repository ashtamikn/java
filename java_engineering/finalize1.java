// package java_engineering;

public class finalize1{
    // public static void main(String[] args)
    // {
    //     String s = new String("RR");
    //     // s = null;
    //     s.finalize();
    //     s.finalize();

    //     s=null;
    //     // Requesting JVM to call Garbage Collector method
    //     System.gc();
    //     System.out.println("Main Completes");
    // }
  
    // // Here overriding finalize method
    // public void finalize()
    // {
    //     System.out.println("finalize method overriden");
    // }
    public static void main(String[] args)
    {
        finalize1 m = new finalize1();
  
        // Calling finalize method Explicitly.
        m.finalize();
        m.finalize();
        m = null;
  
        // Requesting JVM to call Garbage Collector method
        System.gc();
        System.out.println("Main Completes");
    }
  
    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overriden");
    }
}