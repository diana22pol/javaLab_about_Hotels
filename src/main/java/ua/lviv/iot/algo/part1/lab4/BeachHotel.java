package ua.lviv.iot.algo.part1.lab4;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.*;
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)

public class BeachHotel extends Hotel {
        private boolean beachFront;

        public String getHeaders() {return HEADER + ", beachFront";}
        public String toCSV() {
            return super.toCSV() + ", " + beachFront;
        }

        public BeachHotel(String name, int totalRooms, int availableRooms, int rating,  boolean beachFront) {
            super(name, totalRooms, availableRooms, rating);
            this.beachFront = beachFront;
        }

    @Override
    public String getLocation() {
        return getName();
    }
}
