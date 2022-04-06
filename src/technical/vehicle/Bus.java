package technical.vehicle;

import java.time.LocalDate;

public class Bus extends Vehicle{

    private int numberOfSeats;

    public Bus() {
    }

    public Bus(String name, String countryOfMade, LocalDate dateOfMade, String model, int numberOfSeats) {
        super(name, countryOfMade, dateOfMade, model);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                "} " + super.toString();
    }
}
