public class Scoreboard{
    private String name1 = null;
    private String name2 = null;
    private int score1 = 0;
    private int score2 = 0;

    private int activeTeam = 1;
    public Scoreboard(String aName1, String aName2){
        name1 = aName1;
        name2 = aName2;
    }

    public void recordPlay(int pointsScored){
        if (pointsScored > -1){
            if (pointsScored == 0){
                if (activeTeam == 1){
                    activeTeam = 2;
                } else {
                    activeTeam = 1;
                }
            }
            else {
                if (activeTeam == 1) {
                    score1 += pointsScored;
                } else {
                    score2 += pointsScored;
                }
            }
        } else {
            System.out.println("Invalid score");
        }
    }

    public String getScore(){
        String temp = null;
        if (activeTeam == 1){
            temp = name1;
        } else {
            temp = name2;
        }
        String output = "" + score1 + "-" + score2 + " " + temp;
        return output; 
    }
}