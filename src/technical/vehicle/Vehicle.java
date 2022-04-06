package technical.vehicle;

import technical.Tech;

import java.time.LocalDate;

public class Vehicle extends Tech {
    private String countryOfMade;
    private LocalDate dateOfMade;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String name, String countryOfMade, LocalDate dateOfMade, String model) {
        super(name);
        this.countryOfMade = countryOfMade;
        this.dateOfMade = dateOfMade;
        this.model = model;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public String getCountryOfMade() {
        return countryOfMade;
    }

    public void setCountryOfMade(String countryOfMade) {
        this.countryOfMade = countryOfMade;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }


    @Override
    public String toString() {
        return
                "countryOfMade='" + countryOfMade + '\'' +
                ", dateOfMade=" + dateOfMade +'\n'+
                "} " + super.toString();
    }
}
