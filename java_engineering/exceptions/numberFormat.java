// package java_engineering.exceptions;

/**
 * numberFormat
 */
public class numberFormat {
     public static void main(String[] args) {
          try  {
              String s="ashi";
            System.out.println("data "+Integer.parseInt(s));
        }
            catch(NumberFormatException e){
                System.out.println(e);
            }
     }
    
}