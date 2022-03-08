public class age_exception {
    public static void main(String[] args) {
        int age=16;
    
    try{
        if(age<18){
            throw new ArithmeticException("not eligible");
        }
        else{
            System.out.println("all is good");
        }
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    
}
}
