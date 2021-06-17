import java.util.ArrayList;
import java.util.List;
public class Player implements ISaveable{
private String name;
private int hp;
private int strength;
private String weapon;
public Player(String name,int hp,int strength){
this.name=name;
this.hp=hp;
this.strength=strength;
this.weapon="sword";
}
public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
public int getHp(){
return hp;
}
public void setHp(int hp){
this.hp=hp;
}
public int getStrength(){
retrn strength;
}
public void setStrength(int strength){
this.strength=strength;
}
public String getWeapon(){
return weapon;
}
public void setWeapon(String weapon){
this.weapon=weapon;
}
@Override
public String toString(){
return "player("+
"name"+name+
"hp" +hp+
"strength"+strength+
"weapon:"+weapon+')';
}
@Override
public List<String> write(){

List<String> values=new  ArrayList<String>();
values.add(0,this.name);
values.add(1,""+this.hp);
values.add(2,""+this.strength);
values.add(3,this.weapon);


return values;
}
@Override
public void read(List<String> sv){
if(sv!=null&&sv.size()>0){
this.name=sv.get(0);
this.hp=Integer.parseInt(sv.get(1));
this.strength=Integer.parseInt(sv.get(2));
this.weapon=sv.get(3);
}
}
}

