package src.lesson30.Collable;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

//    Створити callable поток, який повертає випадково згенероване число від 1 до 50.
//    Зробити пул с 10 потоків для виклику цього методу

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Callable<Integer> randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(50) + 1;
        };

        try {
            for (int i=0; i < 10; i++) {
                Future<Integer> future = executor.submit(randomNumber);
                int generatedNumber = future.get();
                System.out.println(generatedNumber);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
