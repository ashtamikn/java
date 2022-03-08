public class student{
    int usn;
    String name;
    static String clg="sjce";
    student(int i,String a){
        usn=i;
        name=a;
    }
    
    public static void change(){
        clg="jss";
    }
    void display(){
        System.out.println(usn+" "+name+" "+clg);
    }
    static{
        System.out.println("good morning");
    }
    public static void main(String[] args) {
        student s=new student(1, "a");
        s.display();
        change();
        s.display();
        
    }
}