package technical.militaryEquipment;

import technical.Tech;

public class MilitaryEquipment extends Tech {

    private String countryMade;
    private int speed;
    private String model;

    public MilitaryEquipment() {
    }

    public MilitaryEquipment(String name, String countryMade, int speed, String model) {
        super(name);
        this.countryMade = countryMade;
        this.speed = speed;
        this.model = model;
    }


    public String getCountryMade() {
        return countryMade;
    }

    public void setCountryMade(String countryMade) {
        this.countryMade = countryMade;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "countryMade='" + countryMade + '\n' +
                ", speed=" + speed +'\n'+
                ", model='" + model + '\n' +
                "} " + super.toString();
    }
}
