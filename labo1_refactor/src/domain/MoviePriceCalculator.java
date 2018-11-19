package domain;

public class MoviePriceCalculator implements PriceCalculator {
    public double calculatePrice(int nbOfDays) {
        int price = 5;
        int daysLeft = nbOfDays - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
