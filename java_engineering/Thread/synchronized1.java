class table{
     void printtable(int n){
        for(int i=0;i<n;i++){
            System.out.println(n*i+"  "+n);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class threadA extends Thread{
    table t;
    threadA(table t)
{
    this.t=t;
}
public void run(){
    synchronized(t){
    t.printtable(5);
    }
}
}
class threadB extends Thread{
    table t;
    threadB(table t)
{
    this.t=t;
}
 public void run(){
     synchronized(t){
    t.printtable(10);
     }
}
}

public class synchronized1 {

    public static void main(String[] args) {
        table tobj=new table();
        threadA A=new threadA(tobj);
        threadB B=new threadB(tobj);
        A.start();
        // try{
        //     A.join();
        // }
        // catch(Exception e){System.out.println(e);}
        B.start();
    }
    
}
// or
// class table{
//    synchronized void printtable(int n){
//        for(int i=0;i<n;i++){
//            System.out.println(n*i+"  "+n);
//            try{
//                Thread.sleep(400);
//            }catch(Exception e){
//                System.out.println(e);
//            }
//        }
//    }
// }
// class threadA extends Thread{
//    table t;
//    threadA(table t)
// {
//    this.t=t;
// }
// public void run(){
//    
//    t.printtable(5);
//    
// }
// }
// class threadB extends Thread{
//    table t;
//    threadB(table t)
// {
//    this.t=t;
// }
// public void run(){
//    t.printtable(10);
//     
// }
// }

// public class synchronized1 {

//    public static void main(String[] args) {
//        table tobj=new table();
//        threadA A=new threadA(tobj);
//        threadB B=new threadB(tobj);
//        A.start();
//        // try{
//        //     A.join();
//        // }
//        // catch(Exception e){System.out.println(e);}
//        B.start();
//    }
   
// }
