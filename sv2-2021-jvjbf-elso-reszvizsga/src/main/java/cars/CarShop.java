package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String dealer;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String dealer, int maxPrice) {
        this.dealer = dealer;
        this.maxPrice = maxPrice;
    }

    public String getDealer() {
        return dealer;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() < maxPrice) {
            carsForSell.add(car);
            return true;
        } else {
            return false;
        }
    }

    public int sumCarPrice() {
        int sumPrice = 0;
        for (Car i : carsForSell) {
            sumPrice += i.getPrice();
        }
        return sumPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int sumCars = 0;
        for (Car i : carsForSell) {
            if (i.getPrice() < price) {
                sumCars++;
            }
        }
        return sumCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsWithBrand = new ArrayList<>();
        for (Car i : carsForSell) {
            if (i.getBrand().equals(brand)) {
                carsWithBrand.add(i);
            }
        }
        return carsWithBrand;
    }
}
