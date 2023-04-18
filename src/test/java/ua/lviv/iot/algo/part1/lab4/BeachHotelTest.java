package ua.lviv.iot.algo.part1.lab4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
public class BeachHotelTest {
    BeachHotel hotel = new BeachHotel("Marriott", 150, 62, 4, true);

    @Test
    public void testIsBeachFront() {
        assertTrue(hotel.isBeachFront());
    }

    @Test
    public void testSetBeachFront() {
        hotel.setBeachFront(false);
        assertFalse(hotel.isBeachFront());
    }

    @Test
    public void testGetLocation() {
        assertEquals("Marriott", hotel.getLocation());
    }
    @Test
    public void testToString() {
        String expected = "BeachHotel(super=Hotel(name=Marriott, totalRooms=150, availableRooms=62, rating=4), beachFront=true)";
        assertEquals(expected, hotel.toString());
    }
    @Test
    public void testBookRoom() {
        hotel.bookRoom();
        assertEquals(61, hotel.getAvailableRooms());
    }
    @Test
    public void testReleaseRoom() {
        hotel.releaseRoom();
        assertEquals(63, hotel.getAvailableRooms());
    }
    @Test
    public void testGetBookedRoomsCount() {
        assertEquals(88, hotel.getBookedRoomsCount());
    }
    @Test
    public void testGetAvailableRoomsCount() {
        assertEquals(62, hotel.getAvailableRooms());
    }

}