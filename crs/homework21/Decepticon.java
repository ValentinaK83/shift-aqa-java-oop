package homework21;

public class Decepticon extends Transformer {
    String teamName;
    static String eyeColor = "red";
    boolean kindness = false;

    Decepticon(String name, String teamName, boolean kindness) {
        super(name);
        this.teamName = teamName;
        this.kindness = kindness;
    }

    void transform() {
        System.out.println(getName() + " превращается в наземный и воздушный транспорт, оружие, технику");
    }
}
