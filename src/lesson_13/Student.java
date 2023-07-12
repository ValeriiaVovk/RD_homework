package src.lesson_13;

public class Student extends Person {
    private int numberOfCourse;

    public Student(String name, String surname, int age, int numberOfCourse) {
        super(name, surname, age);
        this.numberOfCourse = numberOfCourse;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    @Override
    public void information() {
        System.out.println("Student: " + getName() + " " + getSurname() + ", " + getAge() + " years old, studies at " + getNumberOfCourse() + " course years");

    }
}
