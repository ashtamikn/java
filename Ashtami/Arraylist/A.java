import java.util.Scanner;
import java.util.ArrayList;
public class MobilePhone{
private String myNo;
private ArrayList<Contact> myContacts;
pubic MobilePhone(String myNo){
this.myNo=myNo;
this.myContacts=new ArrayList<Contact>();
}
public boolean addNewContact(Contact contact){
if(findContact(Contact.getName())>=0){
System.out.println("contact is already on file");
return false;
}
myContacts.add(Contact);
return true;
}
private int findcont(Contact contact){
return this.myContacts.Indexof(Contact);
}
private int


public class A{
private static Scanner s=new Scanner(System.in);
private static 
public static void main(String[] args){
  
  
