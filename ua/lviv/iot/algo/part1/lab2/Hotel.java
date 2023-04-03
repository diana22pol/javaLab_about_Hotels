package lab2_level2;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public abstract class Hotel {
    protected String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;

    /*public Hotel(String name, int totalRooms, int availableRooms, int rating) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
        this.rating = rating;
    }*/

    public abstract String getLocation();

    public void bookRoom() {

        if (availableRooms > 0) {
            availableRooms -= 1;
        }
    }

    public void releaseRoom() {

        if (availableRooms < totalRooms) {
            availableRooms += 1;
        }
    }

    public int getBookedRoomsCount() {

        int bookedRooms = totalRooms - availableRooms;
        return bookedRooms;
    }

    public int getAvailableRoomsCount() {

        return availableRooms;
    }
}

