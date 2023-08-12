package src.lesson_15;

public class Pair <T, K> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }


    public T getSecond() {
        return second;
    }

}
