package src.lesson29;

public class Main {

    public static void main(String[] args) {

        MyThread threadOne = new MyThread("Thread one");
        MyThread threadTwo = new MyThread("Thread two");

        threadOne.start();
        threadTwo.start();

    }
}
