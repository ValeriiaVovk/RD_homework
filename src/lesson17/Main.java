package src.lesson17;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип

        LinkedList<Integer> tenArray = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            tenArray.add(i);
        }

        ArrayList<Integer> twoMillionArray = new ArrayList<>();

        for (int i = 0; i < 2000000; i++) {
            twoMillionArray.add(i);
        }

        //2. Зберегти у колекції список студентів (класс Студент теж створити)

        ArrayList <Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Jenia", "Petrov"));
        studentsList.add(new Student("Olena", "Zubach"));
        studentsList.add(new Student("Tania", "Maksymova"));
        studentsList.add(new Student("Valeriia", "Vovk"));
        studentsList.add(new Student("Oleksandr", "Kutsenko"));

        //3. Вивести цей список

        for (Student student: studentsList) {
            System.out.println(student.getName() + " " + student.getSurname());
        }


    }
}
