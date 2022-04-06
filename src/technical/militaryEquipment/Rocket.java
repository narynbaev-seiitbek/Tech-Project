package technical.militaryEquipment;

public class Rocket extends MilitaryEquipment{

    private double flightRange;

    public Rocket() {
    }

    public Rocket(String name, String countryMade, int speed, String model, double flightRange) {
        super(name, countryMade, speed, model);
        this.flightRange = flightRange;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public Rocket(String name, String countryMade, int speed, String model) {
        super(name, countryMade, speed, model);
    }

    public double getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "flightRange=" + flightRange +
                "} " + super.toString();
    }
}
