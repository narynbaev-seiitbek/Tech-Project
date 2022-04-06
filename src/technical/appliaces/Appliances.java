package technical.appliaces;

import technical.Tech;

public class Appliances extends Tech {

    private String color;
    private String typOfEquipment;

    public Appliances() {
    }

    public Appliances(String name, String color, String typOfEquipment) {
        super(name);
        this.color = color;
        this.typOfEquipment = typOfEquipment;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypOfEquipment() {
        return typOfEquipment;
    }

    public void setTypOfEquipment(String typOfEquipment) {
        this.typOfEquipment = typOfEquipment;
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\n' +
                ", typOfEquipment='" + typOfEquipment + '\n' +
                "} " + super.toString();
    }
}
