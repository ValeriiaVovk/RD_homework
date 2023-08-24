package src.lesson25;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("mystudy.txt");
        if(!file.exists()) {
            saveLineToFile();
        } else {
            System.out.println("Text from file is: " + readLineFromFile());
        }


    }


    private static void saveLineToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mystudy.txt"))) {
            writer.write("I learn Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readLineFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("mystudy.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

}
