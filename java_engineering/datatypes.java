//string
import java.util.Scanner;
import java.text.NumberFormat;

public class datatypes {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //boolean
        String myString="this is a string";
        System.out.println("mystring is"+myString);
        myString=myString+",this is more.";
        System.out.println("\n"+myString);
        String lasString=" 10";
        int myInt=50;
        lasString=lasString+myInt;
        System.out.println(lasString);
        double doubleNumber=120.47d;
        lasString=lasString+doubleNumber;
        System.out.println(lasString);
    }
}
