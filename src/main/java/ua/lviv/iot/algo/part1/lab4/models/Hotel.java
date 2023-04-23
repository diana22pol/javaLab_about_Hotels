package ua.lviv.iot.algo.part1.lab4.models;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public abstract class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;

    public static final String HEADER = "name, totalRooms, availableRooms, rating";
    public String toCSV() {return name + ", " + totalRooms + ","  + availableRooms + ", " + rating;}

    public String getHeaders() {
        return HEADER;
    }
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
        return  totalRooms - availableRooms;
    }

    public int getAvailableRoomsCount() {
        return availableRooms;
    }


}

