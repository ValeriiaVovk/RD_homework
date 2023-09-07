package src.lesson29;

public class MyThread extends Thread {

    private final String nameOfThread;


    public MyThread(String nameOfThread) {
        this.nameOfThread = nameOfThread;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nameOfThread + " : " + i);
        }
    }
}
