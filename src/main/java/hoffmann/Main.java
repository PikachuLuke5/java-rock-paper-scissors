package hoffmann;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Long SEED = System.currentTimeMillis();
    private static Random RNG = new Random(SEED);

    private static String computerChoice() {
        Integer choice = RNG.nextInt(3);

        if (choice == 0) {
            return "r";
        } else if (choice == 1) {
            return "p";
        } else {
            return "s";
        }
    }

    private static User pickWinner(User u1, User u2) {
        if (u1.getChoice().equals(u2.getChoice())) {
            return null;
        } else if (u1.getChoice().equals("s") && u2.getChoice().equals("p")) {
            return u1;
        } else if (u1.getChoice().equals("p") && u2.getChoice().equals("r")) {
            return u1;
        } else if (u1.getChoice().equals("r") && u2.getChoice().equals("s")) {
            return u1;
        } else {
            return u2;
        }
    }

    public static void main(String[] args) {
        Scanner bob = new Scanner(System.in);
        User player = new User();

        // Ask for Name
        System.out.println("What is your name?");
        String name = bob.nextLine();
        player.setName(name);

        // Rock, Paper, Scissors
        System.out.println("Rock, paper or scissors?  Please put the first letter.");
        String choice = bob.nextLine();
        player.setChoice(choice);

        // Computer chooses Rock, Paper, Scissors
        User compy = new User("Compy", computerChoice());

        // Decide who wins
        System.out.println(player);
        System.out.println(compy);

        User winner = pickWinner(player, compy);
        if (winner == null) {
            System.out.println("It is a tie!");
        } else {
            System.out.println(String.format("The winner is %s!", winner.getName()));
        }

        bob.close();
    }
}