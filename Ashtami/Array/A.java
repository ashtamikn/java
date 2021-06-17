import java.util.Scanner;
public class A{
public static void main(String[] args){
int i,min,n;
Scanner a=new Scanner(System.in);
System.out.println("enter no of nos");
n=a.nextInt();
int[] array=new int[n];
System.out.println("enter nos");
for(i=0;i<n;i++)
{
array[i]=a.nextInt();
}
min=array[0];
for(i=0;i<n;i++)
{
if(array[i]<array[0])
min=array[i];
}
System.out.println("min value is "  +min);
}
}

