package Cricket_Game;

public class Match {
    String playerRole;
    int runsGiven;
    int oversPlayed;
    int scoredOnBatting;
     int ballsBowled;
    int ballsPlayed;
    int wicketTaken;
    int oversBowled;

    public void setPlayerRole(int role){
        switch (role){
            case 1: playerRole="Batsman";
            break;
            case 2: playerRole="Bowler";
            break;
            case 3:playerRole="All Rounder";
        }
    }

    public String getPlayerRole(){
        return playerRole;
    }

    public void setOversPlayed() {
        oversPlayed++;
    }

    public int getOversPlayed() {
        return oversPlayed;
    }

    public void setOversBowled() {
        oversBowled++;
    }

    public int getOversBowled() {
        return oversBowled;
    }


    public void setBallsBowled() {
        ballsBowled++;


    }

    public void setBallsPlayed() {
        ballsPlayed++;
    }

    public int getBallsBowled() {
        return ballsPlayed;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void setWicketTaken() {
        wicketTaken++;
    }

    public int getWicketTaken() {
        return wicketTaken;
    }

    public void setScoredOnBatting(int score) {
        scoredOnBatting += score;
    }

    public int getScoredOnBatting() {
        return scoredOnBatting;
    }

    public void setRunsGiven(int runs) {
        runsGiven += runs;
    }

    public int getRunsGiven() {
        return runsGiven;
    }

}


