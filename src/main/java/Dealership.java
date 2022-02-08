import vehicles.HybridCar;
import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private double till;
    private ArrayList<Vehicle> carStock;

    public Dealership(String name){
        this.name = name;
        this.till = 0;
        this.carStock = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public int getCarStockCount() {
        return carStock.size();
    }


    public void addCar(Vehicle vehicle) {
        carStock.add(vehicle);
    }

    public void addMoneyToTill(double amount) {
        this.till += amount;
    }
}
