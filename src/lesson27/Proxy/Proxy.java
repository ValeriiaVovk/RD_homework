package src.lesson27.Proxy;

public class Proxy implements ExamResult {

    private final int expectedMark;

    private RealResult realResult;

    public Proxy(int expectedMark) {
        this.expectedMark = expectedMark;
    }
    @Override
    public void showResult() {
        if (realResult == null) {
            realResult = new RealResult(expectedMark);
        }
        System.out.println("Expected exam result: " + expectedMark);
        realResult.showResult();
    }
}
