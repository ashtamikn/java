import java.util.Scanner;

import java.util.*;
import java.io.*;
class shape{
    void printarea(int area){
        System.out.println(area);
    }
}
class square extends shape{
    // float s;
    void area(){
        int l;
        Scanner a=new Scanner(System.in);
         l=a.nextInt();
        int area=l*l;
        super.printarea(area);
    }
}
public class super_area {
    public static void main(String[] args) {
        square s=new square();
        s.area();
    }
}
