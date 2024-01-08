package hoffmann;

import java.util.Random;

public class ComputerPlayer extends Player {
    
    private static Long SEED = System.currentTimeMillis();
    private static Random RNG = new Random(SEED);
    private static int count = 0;

    public ComputerPlayer() {
        count = count + 1;
        this.name = "Compy " + count;

        Integer choice = RNG.nextInt(3);

        this.choice = GameChoice.values()[choice];
    }

}
