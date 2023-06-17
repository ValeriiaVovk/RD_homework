package src;

public class LessonSix {

    public static void main(String[] args) {

        //Створити програму для виведення чисел від 1 до 10
        System.out.println("Програма для виведення чисел від 1 до 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Завдання 1 завершено");

        //Показати всі парні числа в діапазоні від 1 до 100
        System.out.println("Програма для виведення парних чисел від 1 до 100");
        for (int i = 2; i <= 100; i+=2) {
            System.out.println(i);
        }
        System.out.println("Завдання 2 завершено");

        //Знайти факторіал числа 7
        System.out.println("Програма для виведення факторіалу числа 7");
        int factorial = 1;
        for (int i = 1; i <= 7; i++) {
            factorial = factorial * i;
        }
        System.out.println("Факторіал числа 7 дорівнює " + factorial);
        System.out.println("Завдання 3 завершено");

        //Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)
        System.out.println("Програма для виведення числа фібоначі");
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;

        while(thirdNumber <= 100) {
            System.out.println(thirdNumber);
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        System.out.println("Завдання 4 завершено");


    }
}
