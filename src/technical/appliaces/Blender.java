package technical.appliaces;

public class Blender extends Appliances{
    private String typeOfBlender;

    public Blender() {
    }

    public Blender(String name, String color, String typOfEquipment, String typeOfBlender) {
        super(name, color, typOfEquipment);
        this.typeOfBlender = typeOfBlender;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public String getTypeOfBlender() {
        return typeOfBlender;
    }

    public void setTypeOfBlender(String typeOfBlender) {
        this.typeOfBlender = typeOfBlender;
    }

    @Override
    public String toString() {
        return "Blender information: " +
                "typeOfBlender='" + typeOfBlender + '\'' +
                "} " + super.toString();
    }
}
