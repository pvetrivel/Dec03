package Cricket_Game.model;

import Cricket_Game.Match;
import Cricket_Game.Utils;

import java.util.Random;
import java.util.Scanner;

public class Team {
    long id;
    String name;
    public Player[] players = new Player[11];
    public Match[] playerInMatch = new Match[11];
    static int myTeamOption=0;
    int totalOversTeamPlayed=0;
    Scanner input = new Scanner(System.in);

    public Team(int teamId) {
        chooseCountry();
        System.out.println("Selected Team name :" + name);
        for (int player = 0; player < 11; player++) {
            players[player] = new Player();
            playerInMatch[player] = new Match();
            String s = "t" + teamId + "p" + (player + 1);
            players[player].setName(s);
            playerRole(playerInMatch[player]);
        }

    }

    public void playerRole(Match playerInMatch) {
        Random random = new Random();
        int roleOption = random.nextInt(4 - 1) + 1;
        if ((roleOption > 0) && (roleOption < 4)) {
            playerInMatch.setPlayerRole(roleOption);
        }
    }

    public void playersList() {
        Utils.printMessage("\n"+name+" Team Players List:\n");
        for (int player = 0; player < 11; player++) {
            System.out.println(players[player].getName()+" ("+playerInMatch[player].getPlayerRole()+")");
        }
        System.out.println();
    }

    public String getTeamName() {
        return name;
    }

    public void chooseCountry() {
        //Choosing players team
        System.out.println("Choose your team from list or enter by yourself");
        teamMenu();

    }

    //team menu
    public void teamMenu() {
        System.out.println("Choose team by selecting 1 to 5 to select from list");

        System.out.println("1. India <Press 1>");
        System.out.println("2.Australia <Press 2>");
        System.out.println("3. South Africa <Press 3>");
        System.out.println("4. Srilanka <Press 4>");
        System.out.println("5. Pakistan <Press 5>");
        //choosing contries

        int menuOption = input.nextInt();
        input.nextLine();
        if (myTeamOption != menuOption) {
            switch (menuOption) {
                case 1:

                    name = "India";
                    myTeamOption = menuOption;
                    break;
                case 2:

                    name = "Australia";
                    myTeamOption = menuOption;

                    break;
                case 3:
                    name = "South Africa";
                    myTeamOption = menuOption;
                    break;
                case 4:
                    name = "Srilanka";
                    myTeamOption = menuOption;
                    break;
                case 5:
                    name = "Pakistan";
                    myTeamOption = menuOption;
                    break;
                default:
                    System.out.println("Enter your opponent name");
                    name = input.nextLine();


            }
        } else {
            Utils.printMessage("Choose other than previously selected");
            teamMenu();
        }


    }

   public void setTotalOversTeamPlayed(){
        totalOversTeamPlayed++;
    }
    public int getTotalOversTeamPlayed(){
        return totalOversTeamPlayed;
    }
}
