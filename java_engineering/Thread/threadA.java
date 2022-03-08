 class hi extends Thread{
    public void run(){
        for(int i=0;i<4;i++)
        {
        System.out.println("hi");
        
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }

    }
}
class hello extends Thread{
    public void run(){
        for(int i=0;i<4;i++)
        {
        System.out.println("hello");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){}
    }
    }
}


public class threadA {
    public static void main(String[] args) {
        hi obj1=new hi();
        hello obj2=new hello();
        obj1.start();
        obj2.start();
        
    }
    
}
