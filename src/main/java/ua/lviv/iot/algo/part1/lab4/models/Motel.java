package ua.lviv.iot.algo.part1.lab4.models;
import lombok.*;
import ua.lviv.iot.algo.part1.lab4.models.Hotel;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class Motel extends Hotel {
    private String trackNumberNearby;
    private String trackKilometers;
    private String citiesNodes;

    public Motel(String name,int totalRooms, int availableRooms, int rating, String trackNumberNearby, String trackKilometers, String citiesNodes){
        super(name, totalRooms, availableRooms, rating);
        this.trackNumberNearby = trackNumberNearby;
        this.trackKilometers = trackKilometers;
        this.citiesNodes = citiesNodes;
    }

    public  String getHeaders() {
        return HEADER + ", trackNumberNearby, trackKilometers, citiesNodes";
    }

    public String toCSV() {
        return super.toCSV() + ", " + trackNumberNearby + ", " + trackKilometers + ", " + citiesNodes;
    }

    @Override
    public String getLocation() {
        return citiesNodes + " " + trackKilometers;
    }
}
