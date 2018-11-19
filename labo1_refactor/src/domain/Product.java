package domain;

public abstract class Product {
    private String id;
    private String titel;
    private String type;

    public PriceCalculator getCalculator() {
        return calculator;
    }

    public void setCalculator(PriceCalculator calculator) {
        this.calculator = calculator;
    }

    private PriceCalculator calculator;

    public Product(String id, String titel, String type) {
        setId(id);
        setTitel(titel);
        setType(type);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public String getType() {
        return type;
    }

    public double getPrice(int nbOfDays) {
        return calculator.calculatePrice(nbOfDays);
    }
}
