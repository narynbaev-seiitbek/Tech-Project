package technical.vehicle;

import java.time.LocalDate;

public class Truck extends Vehicle{

    private double cargoСapacity;

    public Truck() {

    }

    public Truck(String name, String countryOfMade, LocalDate dateOfMade, String model) {
        super(name, countryOfMade, dateOfMade, model);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public double getCargoСapacity() {
        return cargoСapacity;
    }

    public void setCargoСapacity(double cargoСapacity) {
        this.cargoСapacity = cargoСapacity;
    }

    @Override
    public String toString() {
        return "Truck " +
                "cargoСapacity=" + cargoСapacity +'\n'+
                "} " + super.toString();
    }
}
