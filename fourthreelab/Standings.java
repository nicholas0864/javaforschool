public class Standings {
    private String teamName = null;
    private int wins = 0;
    private int losses = 0;
    
    public Standings(String aTeamName, int aWins, int aLosses){
        teamName = aTeamName;
        wins = aWins;
        losses = aLosses;
    }
    public String getName(){
        return teamName;
    }
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }
    public Standings(String aTeamName){
        teamName = aTeamName;
        wins = 0;
        losses = 0;
    }
    public void addWins(){
        wins++;
    }
    public void addLosses(){
        losses++;
    }
    public void addWins(int toBeAdded){
        wins += toBeAdded;
    }
    public void addLosses(int toBeAdded){
        losses += toBeAdded;    
    }
    public double findWinPercentage(){
        int totalGames = wins + losses;
        if (totalGames > 0){
            return 1.0 * wins / totalGames;
        } else {
            return 0.0;
        }
    }
    public String toString(){
        String output = teamName + "\nWins: " + wins + "\nLosses: " + losses + "\nWinning Percentage: " + findWinPercentage();
        return output;
    }
}
