public class methods {
    

    public static void main (String [] args){
            
        int position = calculateHighScorePosition(1500);
        displayHighScore("Anthony", position);

        position = calculateHighScorePosition(1000);
        displayHighScore("Anthony", position);

        position = calculateHighScorePosition(500);
        displayHighScore("Anthony", position);

        position = calculateHighScorePosition(100);
        displayHighScore("Anthony", position);

        position = calculateHighScorePosition(25);
        displayHighScore("Anthony", position);
        
    }



    public static void displayHighScore(String pName, int position){
        System.out.println(pName + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int pScore){
        if (pScore >= 1000) {
            return 1;
        }
        if (pScore >= 500) {
            return 2;
        }
        if (pScore >= 100) {
            return 3;
        }
        
        return 4;
        
    }
}
