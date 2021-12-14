import java.util.Scanner;
public class forPrgrm{
public static void main(String[] args){
int i,n,j;
Scanner a=new Scanner(System.in);
System.out.println("enter no of numbers");
n=a.nextInt();
int[] array=new int[n];
// int[] revArray=new int[n];
System.out.println("enter array");
for(i=0;i<n;i++)
{
array[i]=a.nextInt();

}
for(i=0;i<n;i++)
{

System.out.println(" array is "+array[i]); 

}
}

}

