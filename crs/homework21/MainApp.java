package homework21;

public class MainApp {
    public static void main(String[] args) {

        Autobot autobot = new Autobot("Autobot", "Autobots", true);

        autobot.run();
        autobot.fire();
        autobot.charge();
        autobot.transform();

        Decepticon decepticon = new Decepticon("Decepticon", "Decepticons", false);

        decepticon.run();
        decepticon.fire();
        decepticon.charge();
        decepticon.transform();
    }
}

