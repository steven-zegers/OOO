package domain;

public class GamePriceCalculator implements PriceCalculator {
    public double calculatePrice(int nbOfDays) {
        double price = nbOfDays * 3;
        return price;
    }
}
