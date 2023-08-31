package src.lesson27.Fabryk;

public class PhoneFactory {
    public PhoneModel showprice(String type) {
        if (type.equalsIgnoreCase("IPhone")) {
            return new IPhone();
        } else if (type.equalsIgnoreCase("Samsung")) {
            return new Samsung();
        }

        return null;
    }
}
