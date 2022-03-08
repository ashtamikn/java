// package java_engineering.exceptions;

public class both_except {
    public static void main(String[] args) {
        try  {
        //     String s="ashi";
        //   System.out.println("data "+Integer.parseInt(s));
          
           int a=50/0;
        
      }
        //   catch(NumberFormatException e){
        //       System.out.println(e);
        //   }
          catch (ArithmeticException e)
          {
              System.out.println("bb0");
          }
    catch (Exception e)
    {
        System.out.println(e);
        System.out.println("devide by 0");
    }
   }
}
