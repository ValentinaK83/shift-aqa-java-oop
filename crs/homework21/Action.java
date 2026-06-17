package homework21;

public interface Action {
    default void run() {
        System.out.println("Трансформер бежит");
    }

    void fire();

    void charge();

}
