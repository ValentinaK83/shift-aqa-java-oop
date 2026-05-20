package homework21;

public class Autobot extends Transformer {

    String teamName;
    static String eyeColor = "blue";
    boolean kindness = true;

    Autobot(String name, String teamName, boolean kindness) {
        super(name);
        this.teamName = teamName;
        this.kindness = kindness;
    }

    void transform() {
        System.out.println(getName() + " превращается в транспортное средство");
    }
}

