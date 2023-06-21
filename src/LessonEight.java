package src;

import java.util.Arrays;
import java.util.Random;

public class LessonEight {

    public static void main(String[] args) {

        //масив з 10 елементів та заповнений випадковими числами
        Random random = new Random();

        int [] arrayOfNumbers = new int [10];
        for (int i = 0; i < 10; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arrayOfNumbers));

        //знаходження мінімального та максимального числа в масиві
        int minNumber = arrayOfNumbers[0];
        int maxNumber = arrayOfNumbers[0];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i] < minNumber) {
                minNumber = arrayOfNumbers[i];
            }

            if(arrayOfNumbers[i] > maxNumber) {
                maxNumber = arrayOfNumbers[i];
            }
        }

        System.out.println("Мінімальне число: " + minNumber);
        System.out.println("Максимальне число: " + maxNumber);

        //знаходження суми елементів і середнього значення
        int sum = 0;
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            sum = sum + arrayOfNumbers[i];
        }

        double averageNumber = (double) sum / arrayOfNumbers.length;

        System.out.println("Середнє значення: " + averageNumber);
        System.out.println("Сума всіх елементів: " + sum);

    }
}
