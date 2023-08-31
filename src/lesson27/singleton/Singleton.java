package src.lesson27.singleton;

public class Singleton {

    private Singleton() {
    }

    private static final Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }

    public void message() {
        System.out.println("Hello! I'm  Singleton Pattern!");
    }
}
