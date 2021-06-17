import java.util.Scanner;
public class Minmax{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int min=0;
int max=0;

while(true)
{
System.out.println("enter no");
boolean isInt=a.hasNextInt();
if(isInt)
{
int no=a.nextInt();
if(no>max){
max=no;

}
if(no<min){
min=no;
}
}
else{
System.out.println("invalid");
break;
}

}
System.out.println("max" +max+ "min" +min);
 }
 }
