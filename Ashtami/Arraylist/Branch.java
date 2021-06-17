import java.util.ArrayList;
public class Branch{
private String name;
private ArrayList<Customer> customer;
public Branch(String name)[
this.name=name;
this.customer=new ArrayList<Customer>();
}
public String getName(){
return name;
}
public boolean newCust(String cname,double ia){
if(findCustomer(cname)==null){
this.customer.add(new Customer(cname,ia));
return true;
}
return false;
}
public boolean addCTrans(String cname,double amt){

Customer existCust=findCustomer(cname);
if( existCust!=null){
 existCust.addTrans(amt);
 return true;
 }
 return false;
 }
 private Customer findCustomer(String cname){
 for(int i=0;i<this.customer.size();i++){
 Customer checkedCust=this.customer.get(i);
 if(checkedCust.getName().equals(cname)){
 return checkedCust;
 }
 }
 return null;
 }
 }
 
