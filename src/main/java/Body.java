import java.util.List;

public class Body {

    private BodyType type;

    private List<Seat> seatList;

    public Body(BodyType type, List<Seat> seatList) {
        this.type = type;
        this.seatList = seatList;
    }

    public BodyType getType() {
        return type;
    }

    public void setType(BodyType type) {
        this.type = type;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type=" + type +
                ", seatList=" + seatList +
                '}';
    }
}
