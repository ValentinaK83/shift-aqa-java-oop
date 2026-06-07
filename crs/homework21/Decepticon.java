package homework21;

public class Decepticon extends Transformer {
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
        Decepticon.eyeColor = eyeColor;
    }

    private static String eyeColor = "red";

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    private boolean kindness = false;

    Decepticon(String name, String teamName, boolean kindness) {
        super(name);
        this.teamName = teamName;
        this.kindness = kindness;
    }

    void transform() {
        System.out.println(getName() + " превращается в наземный и воздушный транспорт, оружие, технику");
    }
}
