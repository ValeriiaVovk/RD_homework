package src.lessonTwelve;

public class lessonTwelve {

    static {
        System.out.println("1 - Статичний блок батьківського класу");
    }

    {
        System.out.println("4 - Нестатичний блок батьківського класу");
    }

    public lessonTwelve() {
        System.out.println("5 - Конструктор батьківського класу");
    }

    private static int staticVariable = initializeVariable();
    private static int initializeVariable() {
        System.out.println("2 - Ініціалізація статичної змінної в батьківському класі");
        return 0;
    }

    public static void staticMethod() {
        System.out.println("8 - Статичний метод класу");
    }
}
