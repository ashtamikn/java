public class labelledContinue {
    public static void main(String args[])
    {
    first:
        for (int i = 0; i < 3; i++) {
        second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
 
                    continue second;
                }
                System.out.println(i + " " + j);
            }
        }
    }
    
}
