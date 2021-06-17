public class Game{
public static void main(String[]args){
boolean gameOver=true;
int score=1000;
int levelCompleted=6;
int bonus=200;
if(gameOver){
int finalScore=score*(levelCompleted*bonus);
System.out.println("yr score"+finalScore);
}
}
}
