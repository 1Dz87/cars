public class Engine {

    private EngineType type;

    private Float power;

    public Engine(EngineType type, Float power) {
        this.type = type;
        this.power = power;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type=" + type +
                ", power=" + power +
                '}';
    }
}
