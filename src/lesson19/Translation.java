package src.lesson19;

import java.util.Objects;

public class Translation {
    private String english;
    private String japanese;
    private String german;

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getJapanese() {
        return japanese;
    }

    public void setJapanese(String japanese) {
        this.japanese = japanese;
    }

    public String getGerman() {
        return german;
    }

    public void setGerman(String german) {
        this.german = german;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Translation that = (Translation) o;
        return Objects.equals(english, that.english) && Objects.equals(japanese, that.japanese) && Objects.equals(german, that.german);
    }

    @Override
    public int hashCode() {
        return Objects.hash(english, japanese, german);
    }

    @Override
    public String toString() {
        return "Translation{" +
                "english='" + english + '\'' +
                ", japanese='" + japanese + '\'' +
                ", german='" + german + '\'' +
                '}';
    }
}
