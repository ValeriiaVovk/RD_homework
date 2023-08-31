package src.lesson27.Fabryk;

public class IPhone implements PhoneModel{
    @Override
    public void priceInfo() {
        System.out.println("iPhone costs $1500");
    }
}
