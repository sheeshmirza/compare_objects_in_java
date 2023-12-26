package comparable;

// the Comparable interface is used to define the natural ordering of objects.
// it means that the class itself must implement the Comparable interface, and the objects of that class can be compared with each other based on the natural order.
// the Comparable interface has one method: compareTo(Object obj), which compares the current object with the specified object for order.

public class Car implements Comparable<Car> {

    private String brand;
    private String model;
    private Integer year;

    public Car(String brand, String model, Integer year) {
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

    @Override
    public int compareTo(Car anotherCar) {

        // if greater return > 0
        if (this.year > anotherCar.year) {
            return 1;
        }

        // if smaller return < 0
        if (this.year < anotherCar.year) {
            return -1;
        }

        // if equals return 0
        return 0;
    }
}