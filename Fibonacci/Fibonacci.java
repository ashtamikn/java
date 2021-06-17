import java.util.Scanner;
public class Fibonacci{
public static void main(String []args)
{
int i,n,c=1,a=0,b=1;
Scanner s=new Scanner(System.in);
System.out.print("enter n");
n=s.nextInt();
System.out.print("Fibonacci series ");
for(i=1;i<=n;i++)
{
a=b;
b=c;
c=a+b;
System.out.print(a+"\n");
}
}
}
