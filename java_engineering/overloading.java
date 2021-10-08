public class overloading {
    public static void main(String[] args) {
        int newScore=calculateScore("tim",500);
        System.out.println("new score is "+newScore);
        System.out.println("new score is "+calculateScore( 700));

    }
    public static int calculateScore(String player,int score){
        System.out.println("player "+player+"scored "+score);
        return score *1000;
    }
    public static int calculateScore(int score){
        System.out.println("player scored "+score);
        return score *1000;
    }
}
