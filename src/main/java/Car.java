import java.util.List;

public class Car {

    private String name;

    private String color;

    private Engine engine;

    private List<Wheel> wheels;

    private Body body;

    public Car() {
    }

    public Car(String name, String color, Engine engine, Body body, List<Wheel> wheels) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Demapped Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
