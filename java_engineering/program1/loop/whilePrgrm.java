// sum of degits in a number
public class whilePrgrm{
    public static void main(String[] args){
    int a=125;
    int r=0;
    int sum=0;
    
    while(a>0)
    {
     r=a%10;
    sum=sum+r;
    a=a/10;
    }
    System.out.println("sum is " +sum);
    }
    }
    