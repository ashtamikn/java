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
 
 private class Bank{
 private String name;
 private ArrayList<Branch> branches;
 public Bank(String name){
 this.name=name;
 this.branches=new ArrayList<Branch>();
 }
 public boolean addBranch(String bname){
 if(findBranch(bname)==null){
 this.branches.add(new Branch(bname));
 return true;
 }
 return false;
 }
 public boolean addCustomer(String bname,String cname,double ia);
 Branch branch=findBranch(bname);
 if(branch!=null){
 return branch.newCustomer(cname.ia);
 }
 return false;
 }
 public boolean addCustTrans(String bname,String cname,double amt){
Branch branch=findBranch(bname));
if(branch!=null){
return branch.addCustTrans(cname,amt);
}
return false;
}
 private Branch findCustomer(String bname){
 for(int i=0;i<this.branches.size();i++){
 Branch checkedBranch=this.Branch.get(i);
 if(checkedBranch.getName().equals(bname)){
 return checkedBranch;
 }
 }
 return null;
 }
 public boolean listCust(String bname,boolean showTrans){
 Branch branch=findBatch(bname);
 if(branch!=null){
 System.out.println("c details"+branch.getName());
 ArrayList<Customer>branchCust=branch.cust();
 for(int i=0;i,branchCust.size();i++){
 Customer bCustomer=bCustomer.get(i);
 System.out.println("c"+ bCutomer.getName());
 if(showTrans){
 System.out.println("trans");
 ArrayList<double> trans=bCustomer.getTrans();
 for(int j=0;j<trans.size;j++){
  System.out.println(j+1 +" amt"+ trans.get(j));
 }
}
}
return true;
}

else 
return false;

public class C{
public static void main(String[] args){
Bank bank=new Bank("pnb");
bank.addBranch("q");
bank.addCustomer("q","t",4.5);
bank.addCustomer("q","h",46.5);
bank.addCustomer("q","p",74.5);

bank.addBranch("k");
bank.addCustomer("k","n",4.65);
bank.addCustTrans("q","t",44.55);
bank.addCustTrans("q","t",4.55);
bank.addCustTrans("q","h",4.5);
bank.listCust("q",false);
}
}
}






