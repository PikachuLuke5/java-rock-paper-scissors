package hoffmann;

public class User {
    String name;
    String choice;

    // Constructors
    User() {

    }
    
    User(String name, String choice) {
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
