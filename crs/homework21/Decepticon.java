package homework21;

public class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor = "red";
    private boolean kindness = false;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getEyeColor() {
        return eyeColor;
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

    @Override
    public void run() {
        System.out.println(getName() + " бежит");
    }

    @Override
    public void fire() {
        System.out.println(getName() + " стреляет");
    }

    @Override
    public void charge() {
        System.out.println(getName() + " заряжается");
    }

    public void transform() {
        System.out.println(getName() + " превращается в наземный и воздушный транспорт, оружие, технику");
    }

}
