// package java_engineering.exceptions;
import java.util.*;
public class exception_2 {
    public static void main(String[] args) {
        try{
            Scanner b=new Scanner(System.in);
            int n=b.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=b.nextInt();
            }
            for(int i=0;i<5;i++){
                System.out.println("value at ith place is "+a[i]);
            }
            System.out.println("value at ith place is "+a[5]);
        }
            catch (ArrayIndexOutOfBoundsException x){
                System.out.println(x);
            }
            System.out.println("program executed");
        
    
    }
}
