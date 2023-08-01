package src.lesson18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(50) + 1;
            hashSet.add(randomNumber);
            treeSet.add(randomNumber);
            linkedHashSet.add(randomNumber);
        }

        System.out.println("HashSet: ");
        for(int number: hashSet) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("TreeSet: ");
        for(int number: treeSet) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("LinkedHashSet: ");
        for(int number: linkedHashSet) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
