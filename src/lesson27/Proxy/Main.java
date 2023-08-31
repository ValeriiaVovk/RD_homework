package src.lesson27.Proxy;

public class Main {

    public static void main(String[] args) {
        ExamResult examResult = new Proxy(85);

        examResult.showResult();


    }
}
