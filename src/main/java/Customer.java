import vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public int getCarCount() {
        return ownedVehicles.size();
    }

    public void addCar(Vehicle vehicle){
        this.ownedVehicles.add(vehicle);
    }

    public void buyCar(Vehicle vehicle){
        if(money >= vehicle.getPrice()){
            this.money -= vehicle.getPrice();
            this.ownedVehicles.add(vehicle);
        }
    }

}
