package ua.lviv.iot.algo.part1.lab4;
import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class ResortHotel extends Hotel {
    private int childPools;
    private int adultPools;
    private int restaurantsNumber;

    public ResortHotel(String name, int totalRooms, int availableRooms, int rating, int adultPools, int childPools, int restaurantCount) {
        super(name, totalRooms, availableRooms, rating);
        this.adultPools = adultPools;
        this.childPools = childPools;
        this.restaurantsNumber = restaurantCount;
    }

    public  String getHeaders() {
        return HEADER + ", childPools, adultPools, restaurantsNumber";
    }
    public String toCSV() {
        return super.toCSV() + ", " + childPools + ", " + adultPools + ", " + restaurantsNumber;
    }

    @Override
    public String getLocation() {
        return getName();
    }
}
