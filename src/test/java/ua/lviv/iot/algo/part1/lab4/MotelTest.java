package ua.lviv.iot.algo.part1.lab4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MotelTest {
    Motel hotel = new Motel("Highway Motel", 50, 25, 3, "M4", "280 km", "Kyiv-Lviv");
    @Test
    public void testSetTrackNumberNearby() {
        hotel.setTrackNumberNearby("M6");
        assertEquals("M6", hotel.getTrackNumberNearby());
    }
    @Test
    public void testSetTrackKilometers() {
        hotel.setTrackKilometers("280 km");
        assertEquals("280 km", hotel.getTrackKilometers());
    }
    @Test
    public void testSetCitiesNodes() {
        hotel.setCitiesNodes("Kyiv-Lviv");
        assertEquals("Kyiv-Lviv", hotel.getCitiesNodes());
    }
    @Test
    public void testGetLocation() {
        assertEquals("Kyiv-Lviv 280 km", hotel.getLocation());
    }
    @Test
    public void testToString() {
        String expected = "Motel(super=Hotel(name=Highway Motel, totalRooms=50, availableRooms=25, rating=3), trackNumberNearby=M4, trackKilometers=280 km, citiesNodes=Kyiv-Lviv)";
        assertEquals(expected, hotel.toString());
    }
    @Test
    public void testBookRoom() {
        hotel.bookRoom();
        assertEquals(24, hotel.getAvailableRooms());
    }
    @Test
    public void testReleaseRoom() {
        hotel.releaseRoom();
        assertEquals(26, hotel.getAvailableRooms());
    }
    @Test
    public void testGetBookedRoomsCount() {
        assertEquals(25, hotel.getBookedRoomsCount());
    }
    @Test
    public void testGetAvailableRoomsCount() {
        assertEquals(25, hotel.getAvailableRooms());
    }

}
