package src.lesson24;

import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        firstTask(scanner);

        squareOfNumber(scanner);

        scanner.close();

    }



    /*Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.
          При вводі замість числа  буков - показувати повідомлення про помилку на консоль.
          За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок
         */

    private static void firstTask (Scanner scanner) {

        while(true) {
            try {
                System.out.println("Please, write a number");
                int userNumber = scanner.nextInt();
                System.out.println("Your number is: " + userNumber);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error! You wrote wrong number. Try again.");
                scanner.next();
            }

        }
    }

    /*Створити виняток який викидається коли число менше нуля.
    Створити функцію, яка приймає число і повертає його квадрат.
    Якщо число буде менше нуля - то викинути створений вийняток
     */

    private static void squareOfNumber (Scanner scanner) {
        try {
            System.out.println("Write a number to find a square");
            int number = scanner.nextInt();
            if (number < 0 ) {
                throw new NegativeException("This number is less than 0!");
            } else {
                int square = number * number;
                System.out.println("The square of the number is: " + square);
            }
        } catch (NegativeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Please, write a number");
        }

    }
}
