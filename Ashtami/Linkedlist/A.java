import java.util.ArrayList;
public class A{
public static void main(String[] args){
Customer customer=new Customer("k",5.8);
Customer anoCustomer;
anoCustomer=customer;
anoCustomer.setBalance(3.5);
System.out.println("balance for"+customer.getName()+" is" +customer.getBalance());
ArrayList<Integer> intList=new ArrayList<Integer>();
intList.add(1);
intList.add(3);
intList.add(4);
for(int i=0;i<intList.size();i++){
System.out.println(i+" "+intList.get(i));
}
intList.add(1,2);//replace the value at index 1 by3
for(int i=0;i<intList.size();i++){
System.out.println(i+" "+intList.get(i));
}
}
}
