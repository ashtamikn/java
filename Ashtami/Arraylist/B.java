import java.util.Scanner;
import java.util.ArrayList;
public class B{
public static void main(String[] args){
String[] sarray=new String[10];
int[] iarray=new int[10];
ArrayList<String> sarraylist=new ArrayList<String>();
sarraylist.add("ashi");
ArrayList<Integer> intarraylist=new ArrayList<Integer>();
for(int i=0;i<=10;i++){
intarraylist.add(Integer.valueOf(i));
}
for(int i=0;i<=10;i++){
System.out.println(i+"-->"+ intarraylist.get(i).intValue());
}
Integer myIntValue=56;//Integer.valueOf(56)
ArrayList<Double> myDoubleValue=new ArrayList<Double>();
for(double j=0.0;j<=10.0;j+=0.5){
myDoubleValue.add(Double.valueOf(j));//autoboxing primitive to wrapper


for(int i=0;i<myDoubleValue.size();i++){
double value=myDoubleValue.get(i).doubleValue();//unboxing wrapper to primitive
System.out.println(i+"-->"+ value);
}

}
}

