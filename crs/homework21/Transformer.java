package homework21;

public abstract class Transformer {
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

    public abstract void transform();

}
