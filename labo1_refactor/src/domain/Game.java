package domain;

public class Game extends Product {

    public Game(String id, String titel, String type) {
        super(id, titel, type);

        setCalculator(new GamePriceCalculator());
    }

}
