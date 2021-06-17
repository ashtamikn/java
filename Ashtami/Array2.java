import java.util.Scanner;
public class Array2{
public static void main (String[] args){
int i,swap=0,j,n;
Scanner a=new Scanner(System.in);
System.out.println("enter no of nos");
n=a.nextInt();
int[] array=new int[n];
System.out.println("enter" +n+ "nos");
for(i=0;i<n;i++)
{
array[i]=a.nextInt();
}
 for(i=0;i<n;i++)
 {
 for(j=i;j<n;j++)
 {
 if(array[i]<array[j])
 {
 swap=array[i];
 array[i]=array[j];
  array[j]=swap;
  }
  }
  }
   System.out.println("decreasing order");
  for(i=0;i<n;i++)
  {
  System.out.println(array[i] +"\n");
  }
}
}

