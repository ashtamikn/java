class Car{
private String name;
private boolean engine;
private int cylinder;
private int wheels;

public Car(int cylinder,String name){
this.name=name;
this.engine=true;
this.cylinder=cylinder;
this.wheels=4;
}
public int getCylinder(){
return cylinder;
}
public String getName(){
return name;
}

public String startEngine(){
return"car startEngine()";
}
public String accelerate(){
return"car accelerate()";
}
public String brake(){
return"car brake()";
}

}

class Mitsubishi extends Car{
public Mitsubishi(int cylinder,String name){
super(cylinder,name);
}
@Override
public String startEngine(){
return super.startEngine();
}
@Override
public String accelerate(){
return super.accelerate();

}
@Override
 public String brake(){
return super.brake();
}
}
class Ford extends Car{
public Ford(int cylinder,String name){
super(cylinder,name);
}
@Override
public String startEngine(){
return "ford startEngine()";
}
@Override
public String accelerate(){
return "ford accelerate()";

}
@Override
 public String brake(){
return "ford brake()";
}
}

public class Morphex{
public static void main(String[] args){
Car car=new Car(8,"base car");
System.out.println(car.startEngine());
System.out.println(car.accelerate());
System.out.println(car.brake());

Mitsubishi mit=new Mitsubishi(6,"eee");
System.out.println(mit.startEngine());
System.out.println(mit.accelerate());
System.out.println(mit.brake());

Ford ford=new Ford(6,"oooo");
System.out.println(ford.startEngine());
System.out.println(ford.accelerate());
System.out.println(ford.brake());

}
}

