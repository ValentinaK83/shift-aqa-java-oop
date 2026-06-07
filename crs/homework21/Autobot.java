package homework21;

public class Autobot extends Transformer {

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private String teamName;

    public static String getEyeColor() {
        return eyeColor;
    }

    public static void setEyeColor(String eyeColor) {
        Autobot.eyeColor = eyeColor;
    }

    private static String eyeColor = "blue";

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    private boolean kindness = true;


    Autobot(String name, String teamName, boolean kindness) {
        super(name);
        this.teamName = teamName;
        this.kindness = kindness;
    }

    void transform() {
        System.out.println(getName() + " превращается в транспортное средство");
    }
}

