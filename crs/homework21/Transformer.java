package homework21;

public class Transformer {
    private String name;

    Transformer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(this.name + " бежит");
    }

    void fire() {
        System.out.println(this.name + " стреляет");
    }

    void charge() {
        System.out.println(this.name + " заряжается");
    }
}
