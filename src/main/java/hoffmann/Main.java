package hoffmann;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Player> pickWinner(List<Player> players) {

        List<Player> winners = new ArrayList<>(players);
        for (Player p1 : players) {

            for (Player p2 : players) {

                if ((p1.choice.equals("r") && p2.choice.equals("p")) ||
                        (p1.choice.equals("p") && p2.choice.equals("s")) ||
                        (p1.choice.equals("s") && p2.choice.equals("r"))) {
                    winners.remove(p1);
                }
            }
        }
        return winners;
    }

    private static void playGame(Scanner bob) {

        // Ask how many computer players
        System.out.println("How many computer players do you want?");
        Integer numOfComps = Integer.parseInt(bob.nextLine());

        System.out.println("How many human players do you want?");
        Integer numOfHumans = Integer.parseInt(bob.nextLine());

        // Create list of players, add the human player to it
        List<Player> players = new ArrayList<>();

        for (Integer i = 0; i < numOfHumans; i++) {
            Player player = new Player();

            // Ask for Name
            System.out.println(String.format("Player %s, what is your name?", Integer.toString(i+1)));
            String name = bob.nextLine();
            player.setName(name);

            // Rock, Paper, Scissors
            System.out.println("Rock, paper or scissors?  Please put the first letter.");
            String choice = bob.nextLine();
            player.setChoice(choice);

            players.add(player);
        }

        // Computer chooses Rock, Paper, Scissors
        // Counting for loop / Incrementing for loop
        for (Integer i = 0; i < numOfComps; i++) {
            Player compy = new ComputerPlayer();
            players.add(compy);
        }

        for (Player p : players){
            System.out.println(p);
        }

        // Decide who wins
        List<Player> winners = pickWinner(players);
        if (winners.isEmpty() || winners.size() == players.size()) {
            System.out.println("It is a tie!");
        } else {
            System.out.println("The winners are...");
            for (Player p : winners) {
                System.out.println(p.getName());
            }
        }
    }

    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);

        Boolean keepPlaying;

        do {
            playGame(bob);

            System.out.println("Do you want to play again?  Type 'y' to keep playing or anything else to quit.");
            String choice = bob.nextLine();
            keepPlaying = choice.equals("y");

        } while (keepPlaying);

        bob.close();
    }
}