package ua.lviv.iot.algo.part1.lab4.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class MountainHotelTest {
    MountainHotel hotel = new MountainHotel("Winter holidays", 488, 70, 5, true);
    @Test
    public void testSetSkiLodge() {
        hotel.setSkiLodge(false);
        assertFalse(hotel.isSkiLodge());
    }
    @Test
    public void testGetLocation() {
        assertEquals("Winter holidays", hotel.getLocation());
    }
    @Test
    public void testToString() {
        String expected = "MountainHotel(super=Hotel(name=Winter holidays, totalRooms=488, availableRooms=70, rating=5), skiLodge=true)";
        assertEquals(expected, hotel.toString());
    }
    @Test
    public void testBookRoom() {
        hotel.bookRoom();
        assertEquals(69, hotel.getAvailableRooms());
    }
    @Test
    public void testReleaseRoom() {
        hotel.releaseRoom();
        assertEquals(71, hotel.getAvailableRooms());
    }
    @Test
    public void testGetBookedRoomsCount() {
        assertEquals(418, hotel.getBookedRoomsCount());
    }
    @Test
    public void testGetAvailableRoomsCount() {
        assertEquals(70, hotel.getAvailableRooms());
    }
    @Test
    public void testIsSkiLodge() {assertTrue(hotel.isSkiLodge());}
}
