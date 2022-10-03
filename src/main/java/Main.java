import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Wheel> wheels = List.of(new Wheel(12),
                new Wheel(17),
                new Wheel(13),
                new Wheel(18));
        List<Seat> opelSeats = List.of(new Seat(1, SeatType.DRIVER),
                new Seat(2, SeatType.PASSENGER),
                new Seat(3, SeatType.PASSENGER),
                new Seat(4, SeatType.PASSENGER),
                new Seat(5, SeatType.PASSENGER));
        Body opelBody = new Body(BodyType.SEDAN, opelSeats);
        Engine opelEngine = new Engine(EngineType.FUEL, 66F);
        Car opel = new Car("Opel", "Black", opelEngine, opelBody,  wheels);

        List<Wheel> wheels1 = List.of(new Wheel(13),
                new Wheel(13),
                new Wheel(14),
                new Wheel(15));
        List<Seat> mercSeats = List.of(new Seat(1, SeatType.PASSENGER),
                new Seat(2, SeatType.PASSENGER),
                new Seat(3, SeatType.PASSENGER),
                new Seat(4, SeatType.PASSENGER),
                new Seat(5, SeatType.PASSENGER),
                new Seat(6, SeatType.PASSENGER),
                new Seat(7, SeatType.PASSENGER),
                new Seat(8, SeatType.PASSENGER),
                new Seat(9, SeatType.PASSENGER),
                new Seat(10, SeatType.PASSENGER),
                new Seat(11, SeatType.PASSENGER),
                new Seat(12, SeatType.DRIVER));
        Body mercBody = new Body(BodyType.BUS, mercSeats);
        Engine mercEngine = new Engine(EngineType.DIESEL, 70F);
        Car merc = new Car("Mercedes", "Red", mercEngine, mercBody, wheels1);

        List<Wheel> wheels2 = List.of(new Wheel(13),
                new Wheel(13),
                new Wheel(14),
                new Wheel(15));
        List<Seat> teslaSeats = List.of(new Seat(1, SeatType.PASSENGER),
                new Seat(2, SeatType.PASSENGER),
                new Seat(3, SeatType.PASSENGER),
                new Seat(4, SeatType.PASSENGER));
        Body teslaBody = new Body(BodyType.COUPE, teslaSeats);
        Engine teslaEngine = new Engine(EngineType.DIESEL, 90F);
        Car tesla = new Car("Tesla", "Blue", teslaEngine, teslaBody, wheels2);

        List<Seat> wSeats = List.of(new Seat(1, SeatType.PASSENGER),
                new Seat(2, SeatType.PASSENGER),
                new Seat(3, SeatType.PASSENGER),
                new Seat(4, SeatType.PASSENGER),
                new Seat(5, SeatType.PASSENGER),
                new Seat(6, SeatType.PASSENGER),
                new Seat(7, SeatType.PASSENGER));
        Body wBody = new Body(BodyType.MINIVAN, wSeats);
        Engine wEngine = new Engine(EngineType.GAS, 55F);
        Car w = new Car("VolksWagen", "Yellow", wEngine, wBody, wheels1);

        List<Car> cars = List.of(opel, merc, tesla, w);

    }

    private static void mapping(Car car) throws IOException {
        MyMapper myMapper = new MyMapper();
        File file = new File("d:\\JavaGr\\car.json");

        Car mercedes = (Car) myMapper.readFromFile(file, Car.class);
        List<Car> cars = List.of(mercedes, car);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        myMapper.writeToFile(writer, cars);
    }
}
