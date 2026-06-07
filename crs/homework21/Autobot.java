package homework21;

public class Autobot extends Transformer {

    private String teamName;
    private static String eyeColor = "blue";
    private boolean kindness = true;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public static String getEyeColor() {
        return eyeColor;
    }

    public static void setEyeColor(String eyeColor) {
        Autobot.eyeColor = eyeColor;
    }

     public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    Autobot(String name, String teamName, boolean kindness) {
        super(name);
        this.teamName = teamName;
        this.kindness = kindness;
    }

    void transform() {
        System.out.println(getName() + " превращается в транспортное средство");
    }
}

