public class unary {
    public static void main(String args[]){  
        int x=1; 
        int y=x; 
        System.out.println("y "+y);
        System.out.println("x "+x++);
        y=x;
        System.out.println("y "+y);
        System.out.println("x "+ ++x);
        y=x;
        System.out.println("y "+y);
        System.out.println("x "+x--); 
        y=x;
        System.out.println("y "+y);
        System.out.println("x "+--x);
        y=x;
        System.out.println("y "+y);

        }
}
