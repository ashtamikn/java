public class Posneg{
public static void main (String[] args){
checkNo(6);
checkNo(-40);

}
public static void checkNo(int number){
if(number>0){
System.out.println("positive");
}
else if(number<0){
System.out.println("neg");
}
else{
System.out.println("0");
}
}
}
