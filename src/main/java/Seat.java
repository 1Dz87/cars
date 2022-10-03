public class Seat {

    private Integer number;

    private SeatType type;

    public Seat(Integer number, SeatType type) {
        this.number = number;
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public SeatType getType() {
        return type;
    }

    public void setType(SeatType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "number=" + number +
                ", type=" + type +
                '}';
    }
}
