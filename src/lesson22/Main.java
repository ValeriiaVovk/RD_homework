package src.lesson22;


import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        /*
        Створити лист з 20 прізвищами. Вони повинні повторюватися. За допомогою стрім апі перетворити цей лист на мапу.
        У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.
        */

        List <String> listOfSurname = Arrays.asList(
                "Jones", "Watsons", "Vovk", "Petrov", "Jones", "Ivanov", "Williams", "Krasnova", "Shevchenko", "Jones",
                "Petrov", "Anderson", "Ivanov", "Kutsenko", "Shevchenko", "Robinson", "Smith", "Kostenko", "Jackson", "Kostenko"
                );
        Map<String, Long> surnames = listOfSurname.stream().collect(Collectors.groupingBy(surname -> surname, Collectors.counting()));
        System.out.println(surnames);

        /*
        Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API
         */

        List <Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            listOfNumbers.add(random.nextInt(50));
        }

        System.out.println("Random numbers: " + listOfNumbers);

        int sum = listOfNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of random number is: " + sum);
    }
}
