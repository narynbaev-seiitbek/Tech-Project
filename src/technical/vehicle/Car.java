package technical.vehicle;

import java.time.LocalDate;

public class Car extends Vehicle {

    private double engineCapacity;

    public Car() {
    }

    public Car(String name, String countryOfMade, LocalDate dateOfMade, String model, double engineCapacity) {
        super(name, countryOfMade, dateOfMade, model);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car information: " +'\n'+
                "engineCapacity=" + engineCapacity +'\n'+
                "} " + super.toString();
    }
}

