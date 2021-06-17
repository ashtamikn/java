public class Caluclate{
public static void main(String[] args){
caluclateScore(true,800,5,200);
caluclateScore(true,10000,8,200);
}
public static void caluclateScore(boolean gameOver,int score,int levelCompleted,int bonus){
if(gameOver){
int finalScore=score+(levelCompleted*bonus);
finalScore+=2000;
System.out.println("yr final score" +finalScore);
}
}
}

