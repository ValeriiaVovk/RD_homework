package src.lesson19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<String, Translation> translator = new HashMap<>();

        Translation cat = new Translation();
        cat.setEnglish("cat");
        cat.setJapanese("猫");
        cat.setGerman("katze");

        Translation dog = new Translation();
        dog.setEnglish("dog");
        dog.setJapanese("犬");
        dog.setGerman("hund");

        Translation door = new Translation();
        door.setEnglish("door");
        door.setJapanese("ドア");
        door.setGerman("tür");

        Translation glasses = new Translation();
        glasses.setEnglish("glasses");
        glasses.setJapanese("眼鏡");
        glasses.setGerman("gläser");

        Translation copybook = new Translation();
        copybook.setEnglish("copybook");
        copybook.setJapanese("コピーブック");
        copybook.setGerman("schreibheft");

        Translation pen = new Translation();
        pen.setEnglish("pen");
        pen.setJapanese("ペン");
        pen.setGerman("stift");

        Translation pencil = new Translation();
        pencil.setEnglish("pencil");
        pencil.setJapanese("鉛筆");
        pencil.setGerman("bleistift");

        Translation shop = new Translation();
        shop.setEnglish("shop");
        shop.setJapanese("店");
        shop.setGerman("geschäft");

        Translation phone = new Translation();
        phone.setEnglish("phone");
        phone.setJapanese("電話");
        phone.setGerman("telefon");

        Translation laptop = new Translation();
        laptop.setEnglish("laptop");
        laptop.setJapanese("ラップトップ");
        laptop.setGerman("laptop");

        translator.put("кіт", cat);
        translator.put("собака", dog);
        translator.put("двері", door);
        translator.put("окуляри", glasses);
        translator.put("зошит", copybook);
        translator.put("ручка", pen);
        translator.put("олівець", pencil);
        translator.put("магазин", shop);
        translator.put("телефон", phone);
        translator.put("ноутбук", laptop);


        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Введіть слово українською мовою для перекладу або напишіть - завершити для виходу");
            String word = scanner.nextLine().toLowerCase();

            if(word.equals("завершити")) {
                break;
            }

            Translation translation = translator.get(word);

            if (translation != null) {
                System.out.println("Англійська мова: " + translation.getEnglish());
                System.out.println("Японська мова: " + translation.getJapanese());
                System.out.println("Німецька мова: " + translation.getGerman());
            } else {
                System.out.println("Переклад не знайдено.");
            }
        }

        scanner.close();
    }
}
