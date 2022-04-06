package technical.militaryEquipment;

public class Tank extends MilitaryEquipment{
    private String armoredСorps;

    public Tank() {
    }

    public Tank(String name, String countryMade, int speed, String model, String armoredСorps) {
        super(name,countryMade, speed, model);
        this.armoredСorps = armoredСorps;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public String getArmoredСorps() {
        return armoredСorps;
    }

    public void setArmoredСorps(String armoredСorps) {
        this.armoredСorps = armoredСorps;
    }

    @Override
    public String toString() {
        return "Tank information: " +
                "armoredСorps='" + armoredСorps + '\'' +
                "} " + super.toString();
    }
}
