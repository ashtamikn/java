// package java_engineering.exceptions;

public class exception_handling {
    public static void main(String[] args) {
        int a;
        try{
            a=50/0;
        }
        // System.out.println("value of a "+a);
    
    catch (ArithmeticException e)
    // catch (Exception e)
    {
        System.out.println(e);
        System.out.println("devide by 0");
    }
}
}