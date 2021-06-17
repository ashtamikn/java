 class Movie{
 private String name;
public Movie(String name){
this.name=name;
}
public String plot(){
return"no plot here ";
}
public String getName(){
return name;
}
}
class Jaws extends Movie{
public Jaws(){
super("jaws");
}

public String plot(){
return "a shork eats lots of people";
}
}
class IndependenceDay extends Movie{
public IndependenceDay(){
super("Independence Day");
}
@Override
public String plot(){
return"aliens attempt take over earth";
}
}

class MazeRunner extends Movie{
public MazeRunner(){
super("maze runner");
}
@Override
public String plot(){
return "Imperial forces try to take over universe";
}
}
class Forgetable extends Movie{
public Forgetable(){
super("Forgetable");
}
}
public class Polymorphism{
public static void main(String[] args){
for(int i=1;i<11;i++){
Movie movie=randMovie();
System.out.println("movie"+i+":"+movie.getName()+"\n"+"plot"+movie.plot()+"\n");
}

}
public static Movie randMovie(){
int randNo=(int)(Math.random()*5)+1;
System.out.println("random no generated was"+randNo);
switch(randNo){

case 1:
return new Jaws();
case 2:
return new IndependenceDay();
case 3:
return new MazeRunner();
case 4:
return new Forgetable();

default:
return null;
}

}
}

