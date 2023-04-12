package lab2_level2;
import lombok.*;
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class BeachHotel extends Hotel{
        private boolean beachFront;

        public BeachHotel(String name, int totalRooms, int availableRooms, int rating,  boolean beachFront) {
            super(name, totalRooms, availableRooms, rating);
            this.beachFront = beachFront;
        }

    @Override
    public String getLocation() {
        return null;
    }
}
