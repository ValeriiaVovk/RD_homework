package src.lesson_14;

public class Main {
    public static void main(String[] args) {
        Person driver = new Driver();
        Person pilot = new Pilot();

        driver.drive();
        pilot.fly();
    }
}
