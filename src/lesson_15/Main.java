package src.lesson_15;

public class Main {
    public static void main(String[] args) {

        Pair <Integer, Integer> integerPair = new Pair<>(20, 25);
        System.out.println("First int: " + integerPair.getFirst());
        System.out.println("Second int: " + integerPair.getSecond());

        Pair <String, String> stringpair = new Pair<>("Valeriia", "Vovk");
        System.out.println("First string: " + stringpair.getFirst());
        System.out.println("Second string: " + stringpair.getSecond());

        Animal dog = new Animal("Dog", "gav");
        Animal cat = new Animal("cat", "meow");
        Pair <Animal, Animal> objectPair = new Pair<>(dog, cat);
        System.out.println("First object: " + objectPair.getFirst());
        System.out.println("Second object: " + objectPair.getSecond());
    }
}
