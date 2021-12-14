// package java_engineering.exceptions;

public class null_exception {
    public static void main(String[] args) {
        try{
            String s=null;
            // System.out.println("null_exception.main()");
            System.out.println("string length "+s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        System.out.println("executed");
    }
}
