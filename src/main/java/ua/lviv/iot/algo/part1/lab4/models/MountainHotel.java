package ua.lviv.iot.algo.part1.lab4.models;
import lombok.*;
import ua.lviv.iot.algo.part1.lab4.models.Hotel;

@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class MountainHotel extends Hotel {
        private boolean skiLodge;

        public MountainHotel(String name, int totalRooms, int availableRooms, int rating, boolean skiLodge) {
            super(name, totalRooms, availableRooms, rating);
            this.skiLodge = skiLodge;
        }

    public  String getHeaders() {
        return HEADER + ", skiLodge";
    }
    public String toCSV() {
        return super.toCSV() + ", " + skiLodge;
    }

    @Override
    public String getLocation() {
        return getName();
    }
}
