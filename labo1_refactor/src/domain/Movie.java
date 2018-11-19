package domain;

public class Movie extends Product{
    public Movie(String id, String titel, String type) {
        super(id, titel, type);

        setCalculator(new MoviePriceCalculator());
    }

}
