package src.lesson27.Fabryk;

public class Main {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();

        PhoneModel iphone = phoneFactory.showprice("IPhone");
        iphone.priceInfo();

        PhoneModel samsung = phoneFactory.showprice("Samsung");
        samsung.priceInfo();

    }
}
