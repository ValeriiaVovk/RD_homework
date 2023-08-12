package src.lesson21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Petrov", 8.5));
        students.add(new Student("Ivanov", 10.0));
        students.add(new Student("Krasnova", 7.6));
        students.add(new Student("Orzehova", 11.2));
        students.add(new Student("Vovk", 10.4));
        students.add(new Student("Synytsia", 9.1));
        students.add(new Student("Chydakov", 8.3));

        System.out.println("Original list of students:");
        System.out.println(students);

        students.sort((student1, student2) -> student1.getSurname().compareTo(student2.getSurname()));
        System.out.println("Sorted list of students by surname:");
        System.out.println(students);

        students.sort((student1, student2) -> Double.compare(student1.getAverageScore(), student2.getAverageScore()));
        System.out.println("Sorted list of students by average score:");
        System.out.println(students);
    }
}
