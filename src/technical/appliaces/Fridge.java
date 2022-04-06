package technical.appliaces;

public class Fridge extends Appliances{
    private double depth;
    private double height;
    private String brand;

    public Fridge() {
    }

    public Fridge(String name, String color, String typOfEquipment, double depth, double height, String brand) {
        super(name, color, typOfEquipment);
        this.depth = depth;
        this.height = height;
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "depth=" + depth +
                ", height=" + height +
                ", brand='" + brand + '\'' +
                "} " + super.toString();
    }
}
