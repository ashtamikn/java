public class threadB extends Thread {
  String name;
  threadB(String name){
      this.name=name;
      


  }  
  public void run(){
    System.out.println(currentThread());

      for( int i=1;i<=3;i++){
          System.out.println("task "+name);
          try{
              Thread.sleep(1000);
          }
          catch(Exception e){System.out.println(e);}
      }
  }
    public static void main(String[] args) {
        threadB t1=new threadB("good morning");
        threadB t2=new threadB("mysuru");
        System.out.println("a"+t1.isAlive());
        
        t1.start();
        System.out.println("b"+t1.isAlive());
        t1.setPriority(3);
        System.out.println(t1.getPriority());

        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("c"+t1.isAlive());

        t2.start();
    }
}
