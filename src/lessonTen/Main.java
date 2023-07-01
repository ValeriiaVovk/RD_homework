package src.lessonTen;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Valeriia");
        student.setSurname("Vovk");
        student.setAge(25);

        System.out.println("Student: " + student.getName() + " " + student.getSurname() + " " + student.getAge() + " years old");

        Teacher teacher = new Teacher();
        teacher.setName("Nina");
        teacher.setSurname("Kutsenko");
        teacher.setAge(38);
        teacher.setStudent(student.getName() + " " + student.getSurname() + " " + student.getAge() + " years old");

        System.out.println("Teacher: " + teacher.getName() + " " + teacher.getSurname() + " " + teacher.getAge() + " years old has student " + teacher.getStudent());
    }
}
