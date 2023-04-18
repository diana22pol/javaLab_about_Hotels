package ua.lviv.iot.algo.part1.lab4;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
@Getter
public class HotelManager {
    private List<Hotel> hotelList = new LinkedList<>();

    public void addHotel(final Hotel hotel) {
        hotelList.add(hotel);
    }

    public List<Hotel> findHotelsWithTotalRoomsGreaterThan(int totalRooms) {
        return hotelList.stream().filter(h -> h.getTotalRooms() > totalRooms).collect(Collectors.toList());
    }

    public List<Hotel> findHotelsWithRatingGreaterThan(int rating) {
        return hotelList.stream().filter(h -> h.getRating() > rating).collect(Collectors.toList());
    }
}