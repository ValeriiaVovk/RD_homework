package src.lesson_13;

public class Main {

    public static void main(String[] args) {
        Person student = new Student("Oleksandr", "Petrov", 22,3);
        Person teacher = new Teacher("Olena", "Krasnova", 41, "economy");

        student.information();
        teacher.information();
    }
}
