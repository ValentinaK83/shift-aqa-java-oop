package homework21;

public class Decepticon extends Transformer implements Action {
    String teamName;
    static String eyeColor = "red";
    boolean kindness = false;

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
