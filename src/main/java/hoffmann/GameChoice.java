package hoffmann;

import java.security.InvalidParameterException;

public enum GameChoice {
    ROCK,
    PAPER,
    SCISSORS;

    public static GameChoice getChoice(String stringChoice) {
        if (stringChoice.equals("r")) {
            return ROCK;
        } else if (stringChoice.equals("p")) {
            return PAPER;
        } else if (stringChoice.equals("s")) {
            return SCISSORS;
        } else {
            throw new InvalidParameterException("You must enter 'r', 'p', or 's'!");
        }
    }
}
