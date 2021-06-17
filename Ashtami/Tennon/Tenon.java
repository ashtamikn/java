import java.util.Scanner;
public class Tenon{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int count=0;
int sum=0;



System.out.println("enter nos");
while(true){
boolean isAnInt=a.hasNextInt();
if(isAnInt){
int no=a.nextInt();
count++;
sum+=no;
if(count==10){
break;
}
}
else
{
System.out.println("invalid no");
}
a.nextLine();
}

System.out.println("sum=" +sum);

}
}
