package lab2_level2;
import lombok.*;
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class MountainHotel extends Hotel{
        private boolean skiLodge;

        public MountainHotel(String name, int totalRooms, int availableRooms, int rating, boolean skiLodge) {
            super(name, totalRooms, availableRooms, rating);
            this.skiLodge = skiLodge;
        }

    @Override
    public String getLocation() {
        return null;
    }
}
