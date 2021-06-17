import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class Demo{
public static void main(String[] args){
LinkedList<String> visit=new LinkedList<String>();
addInOrder(visit,"ac");
addInOrder(visit,"cx");
addInOrder(visit,"dx");
addInOrder(visit,"bv");
addInOrder(visit,"nf");
addInOrder(visit,"kl");
//visit.add("ac");
//visit.add("cx");
//visit.add("dx");
//visit.add("bv");
//visit.add("nf");

//visit.add("pe");
printList(visit);
addInOrder(visit,"az");
//visit.add(1,"kl");
printList(visit);
//visit.remove(4);
//printList(visit);
}

private static void printList(LinkedList<String> linkedList){
Iterator<String> i=linkedList.iterator();
while(i.hasNext())
{
System.out.println("new "+i.next());
}
System.out.println("============");
}
private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
ListIterator<String> j=linkedList.listIterator();
while(j.hasNext()){
int compare=j.next().compareTo(newCity);
if(compare==0)
{//do not add
System.out.println(newCity+"is already there");
return false;
}
else if(compare>0)
{//=>a>b
j.previous();
j.add(newCity);
return true;
}
else if(compare<0){
}
}
j.add(newCity);
return true;
}

}
