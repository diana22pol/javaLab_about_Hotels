package lab2_level2;
import lombok.*;
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class ResortHotel extends Hotel{
    private int childPools;
    private int adultPools;
    private int restaurantsNumber;

    public ResortHotel(String name, int totalRooms, int availableRooms, int rating, int adultPools, int childPools, int restaurantCount) {
        super(name, totalRooms, availableRooms, rating);
        this.adultPools = adultPools;
        this.childPools = childPools;
        this.restaurantsNumber = restaurantCount;
    }

    @Override
    public String getLocation() {
        return name;
    }
}
