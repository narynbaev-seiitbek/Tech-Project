package technical.appliaces;

public class Microwave extends Appliances{

    private String control;

    public Microwave() {
    }

    public Microwave(String name, String color, String typOfEquipment, String control) {
        super(name, color, typOfEquipment);
        this.control = control;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "control='" + control + '\'' +
                "} " + super.toString();
    }
}
