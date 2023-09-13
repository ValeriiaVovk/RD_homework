package src.lesson30;

import java.util.Random;

public class MyThread extends Thread{

//    Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль.
//    Якщо згенероване число == 5 - то перервати роботу потоку
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int number = random.nextInt(10) +1;
            System.out.println("Generated number is:" + number);

            if (number == 5) {
                System.out.println("Thread stopped, because generated number is 5");
                break;
            }
        }
    }
}
