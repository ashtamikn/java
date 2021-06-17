import java.util.Scanner;
public class R{
public static void main(String[] args){
int i,n,j;
Scanner a=new Scanner(System.in);
System.out.println("enter no of nos");
n=a.nextInt();
int[] array=new int[n];
int[] revArray=new int[n];
System.out.println("enter array");
for(i=0;i<n;i++)
{
array[i]=a.nextInt();

}
for(i=n-1,j=0;i>=0;i--,j++)
{
revArray[j]=array[i];
System.out.println("reversed array"+revArray[j]); 

}
}

}

