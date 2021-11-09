package cars;

public class Car {
    private String brand;
    private double carEngine;
    private int price;

    public Car(String brand, double carEngine, Color color, int price) {
        this.brand = brand;
        this.carEngine = carEngine;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getCarEngine() {
        return carEngine;
    }

    public int getPrice() {
        return price;
    }

    public void decreasePrice(int percent) {
        int calculatePrice = this.price / 100 * percent;
        this.price -= calculatePrice;
    }
}
