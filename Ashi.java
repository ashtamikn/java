import java.util.Scanner;

public class Ashi1{
int a() {}
}


public class Ashi{
public static void main(String []args){
double n1,n2;
Scanner scanner =new Scanner(System.in);
Ashi1 a =new Ashi1();
System.out.print("enter first no;");
n1=scanner.nextDouble();
System.out.print("enter 2nd no");
n2=scanner.nextDouble();
System.out.print("enter operator");
char operator=scanner.next().charAt(0);
scanner.close();
double output;
switch(operator)
{
case'+':
output=n1+n2;
break;
case'-':
output=n1-n2;
break;
case'*':
output=n1*n2;
break;
case'/':
output=n1/n2;
break;

default:
System.out.printf("wrong");
return;
}
System.out.println(n1+" "+operator+" "+n2+": "+output);
}
}
