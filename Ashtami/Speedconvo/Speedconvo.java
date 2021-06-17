public class  Speedconvo{
public static void main(String[] args){
double miles=toMilesPerHour(456);
System.out.println("ans is" +miles);
}
public static long toMilesPerHour(double kilometerPerHour)
{
if(kilometerPerHour<0);{
System.out.println("invalid");
}
else
{
long milesPerHour=Math.round(kilometerPerHour/1.609);
return(milesPerHour);

 }
}
}
