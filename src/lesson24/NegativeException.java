package src.lesson24;

import java.util.Objects;

public class NegativeException extends Exception {

    private String message;

    public NegativeException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NegativeException that = (NegativeException) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "NegativeException{" +
                "message='" + message + '\'' +
                '}';
    }
}
