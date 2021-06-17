import java.util.Scanner;
public class Palindrome{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int n,r,sum=0;
System.out.print("enter no\n");
n=a.nextInt();
int  temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.print("it is pali");
else
System.out.print("not pali");
}
}
