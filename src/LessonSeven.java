package src;

import java.util.Scanner;

public class LessonSeven {

    public static void main(String[] args) {

        //Створити метод який повертає куб заданого числа
        Scanner cube = new Scanner(System.in);
        System.out.println("Введіть число для знаходження кубу");
        int number = cube.nextInt();
        System.out.println(cubeOfNumber(number));
        System.out.println("Завдання 1 завершено");

        //Метод повинен вивести зірочку стільки разів, скільки передав користувач у метод
        Scanner stars = new Scanner(System.in);
        System.out.println("Скільки разів вивести зірочку?");
        int starCount = stars.nextInt();
        System.out.println(printStars(starCount));
        System.out.println("Завдання 2 завершено");


        //Метод повинен вивести переданий символ стільки разів, скільки передав користувач у метод
        Scanner symbol = new Scanner(System.in);
        System.out.println("Який символ потрібно вивести?");
        String typeOfSymbol = symbol.next();
        System.out.println("Скільки разів вивести цей символ");
        int symbolCount = symbol.nextInt();
        System.out.println(printSymbol(typeOfSymbol, symbolCount));
        System.out.println("Завдання 3 завершено");

    }


    //Метод для знаходження кубу числа
    private static String cubeOfNumber(int number) {
        int cubeNumber = number * number * number;
        return ("Куб числа " + number + " дорівнює " + cubeNumber);
    }

    //Метод для виведення зірочки стільки разів, скільки передав користувач у метод
    private static String printStars(int starCount) {
        for (int i = 1; i <= starCount; i++) {
            System.out.print("*");
        }
        return ("");
    }

    //Метод для виведення переданого символу стільки разів, скільки передав користувач у метод
    private static String printSymbol(String typeOfSymbol, int symbolCount) {
        for (int i = 1; i <= symbolCount; i++) {
            System.out.print(typeOfSymbol);
        }
        return ("");
    }
}
