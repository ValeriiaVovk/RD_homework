package src.lesson28;

import static src.lesson28.Validator.validate;

public class Main {

    public static void main(String[] args) {

        User Marina = new User("12457845");
        User Olena = new User("pass12345");

        try {
            validate(Marina);
            System.out.println("Password passed validation.");

            validate(Olena);
            System.out.println("Password passed validation.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
