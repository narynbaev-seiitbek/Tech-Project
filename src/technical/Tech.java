package technical;

public class Tech {

    private String name;

    public Tech() {
    }

    public Tech(String name) {
        this.name = name;

    }
    public void turnOn() {
        System.out.println(name+" is turning on");
    }
    public void turnOff() {
        System.out.println(name+" is turning off");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Tech{" +
                "name='" + name + '\'';
    }
}
