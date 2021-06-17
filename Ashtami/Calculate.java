public class Calculate{
public static void main(String[] args){
int newScore=calculateScore("t",500);
System.out.println("new score is"+newScore);
newScore=calculateScore(75);
System.out.println("new score"+newScore);
calculateScore();
}
public static int calculateScore(String playerName,int score){
System.out.println("player"+playerName+"scored"+score+"points");
return score*1000;
}
public static int calculateScore(int score){
System.out.println("player scored"+score+"points");
return score*1000;
}
public static int calculateScore(){
System.out.println("no player scored no points");
return 0;
}
}
