package src;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {
        Scanner askNumber = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int firstNumber = askNumber.nextInt();
        System.out.println("Введіть друге число");
        int secondNumber = askNumber.nextInt();

        System.out.println("Сума чисел: " + (firstNumber + secondNumber));
        System.out.println("Різниця чисел: " + (firstNumber - secondNumber));
        System.out.println("Добуток чисел: " + (firstNumber * secondNumber));
        System.out.println("Частка чисел: " + (firstNumber / secondNumber));

    }
}
