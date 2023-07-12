package src.lesson_13;

public class Teacher extends Person {
    private String subject;
    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void information() {
        System.out.println("Teacher: " + getName() + " " + getSurname() + ", " + getAge() + " years old, teaches " + getSubject());

    }
}
