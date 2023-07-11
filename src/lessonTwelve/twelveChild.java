package src.lessonTwelve;

public class twelveChild extends lessonTwelve{

    static {
        System.out.println("3 - Статичний блок успадкованого класу");
    }

    {
        System.out.println("6 - Нестатичний блок успадкованого класу");
    }

    public twelveChild() {
        System.out.println("7 - Конструктор успадкованого класу");
    }
}
