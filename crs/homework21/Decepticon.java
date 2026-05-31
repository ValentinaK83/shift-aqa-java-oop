package homework21;

public class Decepticon extends Transformer {
    private String teamName;
    private static String eyeColor = "red";
    private boolean kindness = false;

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
        Decepticon.eyeColor = eyeColor;
    }

    public boolean isKindness() {
        return kindness;
    }

    public void setKindness(boolean kindness) {
        this.kindness = kindness;
    }

    Decepticon(String name, String teamName, boolean kindness) {
        super(name);
        this.teamName = teamName;
        this.kindness = kindness;
    }

    void transform() {
        System.out.println(getName() + " превращается в наземный и воздушный транспорт, оружие, технику");
    }
}
