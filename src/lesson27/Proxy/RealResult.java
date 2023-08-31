package src.lesson27.Proxy;

public class RealResult implements ExamResult{

    private int mark;

    public RealResult(int mark) {
        this.mark = mark;
        loading();
    }

    private void loading() {
        System.out.println("Loading real exam result");
    }
    @Override
    public void showResult() {
        System.out.println("Real exam result: " + mark);
    }
}
