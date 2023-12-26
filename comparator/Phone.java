package comparator;

public class Phone {

    private String brand;
    private String model;
    private Integer year;

    public Phone(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.model + ", manufactured in " + this.year + "!";
    }
}