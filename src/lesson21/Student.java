package src.lesson21;

import java.util.Objects;

public class Student {
    private String surname;
    private double averageScore;

    public Student(String surname, double averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.averageScore, averageScore) == 0 && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, averageScore);
    }
}
