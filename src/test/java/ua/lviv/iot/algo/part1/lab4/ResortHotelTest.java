package ua.lviv.iot.algo.part1.lab4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResortHotelTest {
    ResortHotel hotel = new ResortHotel("Beach Resort", 300, 150, 4, 2, 1, 7);
    @Test
    public void testGetLocation() { assertEquals("Beach Resort", hotel.getLocation());}
    @Test
    public void testSetChildPools() {
        hotel.setChildPools(3);
        assertEquals(3, hotel.getChildPools());
    }
    @Test
    public void testSetAdultPools() {
        hotel.setAdultPools(6);
        assertEquals(6, hotel.getAdultPools());
    }
    @Test
    public void testSetRestaurantsNumber() {
        hotel.setRestaurantsNumber(8);
        assertEquals(8, hotel.getRestaurantsNumber());
    }
    @Test
    public void testTestToString() {
        String expected = "ResortHotel(super=Hotel(name=Beach Resort, totalRooms=300, availableRooms=150, rating=4), childPools=1, adultPools=2, restaurantsNumber=7)";
        assertEquals(expected, hotel.toString());
    }
}
