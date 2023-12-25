package hoffmann;

public class Player {
    String name;
    String choice;

    // Constructors
    Player() {

    }
    
    Player(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }


    // Accessors and Modifiers
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoice() {
        return this.choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }


    // This is what the user becomes when it is output as a String!
    public String toString() {
        return String.format("%s picked %s!", name, choice);
    }
}
