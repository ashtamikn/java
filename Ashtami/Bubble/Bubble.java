import java.util.Scanner;
public class Bubble{
int i = 8;

Bubble() {
this.i = 8;
}

public static void main(String args[])
{
int i,j,n,swap;
Scanner a=new Scanner(System.in);
System.out.println("enter no of integers");
n=a.nextInt();
int array[]=new int[n];
System.out.println("enter nos");
for(i=0;i<n+1;i++)
array[i]=a.nextInt();
for(i=0;i<(n-1);i++)
{
for(j=0;j<(n-i-1);j++)
{
if(array[j]>array[j+1])
{
swap=array[j];
array[j]=array[j+1];
array[j+1]=swap;
}
}
}
System.out.println("sorted nos");
for(i=0;i<n;i++)
System.out.println(array[i]);
}
}

// add(1, 2)
// add(n1 , n1)
{

}
