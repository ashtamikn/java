public class A{
public static void main(String[] args){
player tim=new player("ashi",10,15);
System.out.println(tim.toString();
saveObject(tim);
tim.sethp(8);
System.out.println(tim);
tim.setWeapon("Stormbringer");
saveObject(tim);
loadObject(tim);
System.out.println(tim);
}
public static  ArrayList<String>() rv(){
 ArrayList<String>() values=new ArrayList<string>();
 Scanner a=new Scanner(System.in);
 boolean quit=false;
 int i=0;
 System.out.println("choose\n"+
 "1 to String\n"+
 "0 to quit");
 while(!quit){
 System.out.println("choose OPT;");
 int c=a.nextInt();
 a.nextLine();
 switch(c){
 case 0:
 quit=true;
 break;
 case 2:
 System.out.println("enter string");
 String si=a.nextLine();
 values.ass(i,si);
 i++;
 break;
 }
 }
 return values;
 }
 public static void so(ISaveable ots){
 for(int j=0;j<ots.write().size();j++){
 System.out.println("saving"+ots.write().get(i)+"to device");
 }
 }
 public static voidlb(ISaveable otl){
 ArrayList<String> values=readValues();
 otl.read(Values);
 }
 
