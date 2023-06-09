package src;

import java.util.Scanner;

public class LessonFive {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int firstNumber = number.nextInt();
        System.out.println("Введіть друге число");
        int secondNumber = number.nextInt();

        System.out.println(bigNumber(firstNumber, secondNumber));
        System.out.println(smallNumber(firstNumber, secondNumber));
        System.out.println(evenFirstNumber(firstNumber));
        System.out.println(evenSecondNumber(secondNumber));
    }

    private static String bigNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return ("Більшим є число " + firstNumber);
        } else if (secondNumber > firstNumber) {
            return ("Більшим є число " + secondNumber);
        } else {
            return ("Немає більшого числа, вони рівні");
        }

    }

    private static String smallNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return ("Меншим є число " + firstNumber);
        } else if (secondNumber < firstNumber) {
            return ("Меншим є число " + secondNumber);
        } else {
            return ("Немає меншого числа, вони рівні");
        }
    }

    private static String evenFirstNumber(int firstNumber) {
        if (firstNumber % 2 == 0) {
            return ("Число " + firstNumber + " є парним");
        } else {
            return ("Число " + firstNumber + " є непарним");
        }
    }

    private static String evenSecondNumber(int secondNumber) {
        if (secondNumber % 2 == 0) {
            return ("Число " + secondNumber + " є парним");
        } else {
            return ("Число " + secondNumber + " є непарним");
        }
    }

}
