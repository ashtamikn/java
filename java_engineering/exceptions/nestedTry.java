public class nestedTry {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("going to devide by 0");
                int b=39/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[]=new int[5];
                a[5]=9;

            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println("other statements");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("exception handled");
        }
        System.out.println("normal flow");
    }
    
}
