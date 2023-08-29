package src.lesson26;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("mystudy.txt");
        if(!Files.exists(path)) {
            saveLineToFile();
        } else {
            System.out.println("Text from file is: " + readLineFromFile());
        }


    }


    private static void saveLineToFile() {
        try {
            String content = "I learn Java.";
            Files.write(Paths.get("mystudy.txt"), content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readLineFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("mystudy.txt"))) {
            for (String line : Files.readAllLines(Paths.get("mystudy.txt"), StandardCharsets.UTF_8)) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
