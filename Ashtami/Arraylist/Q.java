import java.util.ArrayList;
public class Customer {
private String name;
private ArrayList<Double> trans;
public Customer(String name,double ia){
this.name=name;
this.trans=new ArrayList<Double>();
addTrans(ia);


}
public void addTrans(double amt){
this.trans.add(amt);

}
public String getName(){
return name;
}
public ArrayList<Double> getTrans(){
return trans;
}
}
