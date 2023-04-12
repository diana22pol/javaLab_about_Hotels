package lab2_level2;
import lombok.*;
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class Motel extends Hotel{
    private String trackNumberNearby;
    private String trackKilometers;
    private String citiesNodes;

    public Motel(String name,int totalRooms, int availableRooms, int rating, String trackNumberNearby, String trackKilometers, String citiesNodes){
        super(name, totalRooms, availableRooms, rating);
        this.trackNumberNearby = trackNumberNearby;
        this.trackKilometers = trackKilometers;
        this.citiesNodes = citiesNodes;
    }

    @Override
    public String getLocation() {
        return citiesNodes + trackKilometers;
    }
}
