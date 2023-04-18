package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HotelManagerTest {
    private HotelManager manager;
    @BeforeEach
    public void setUp() {
        manager = new HotelManager();
        manager.addHotel(new ResortHotel("Beach Resort", 300, 150, 4, 2, 1, 7));
        manager.addHotel(new ResortHotel("Grand Resort", 500, 200, 5, 3, 2, 10));

        manager.addHotel(new Motel("Highway Motel", 50, 25, 3, "M4", "280 km", "Kyiv-Lviv"));
        manager.addHotel(new Motel("Country Motel", 30, 15, 2, "M7", "126 km", "Vinnytsia-Odessa"));

        manager.addHotel(new BeachHotel("Marriott", 150, 62, 4, true));
        manager.addHotel(new BeachHotel("Hilton", 80, 22, 3, false));

        manager.addHotel(new MountainHotel("Winter holidays", 488, 70, 5, true));
        manager.addHotel(new MountainHotel("Ice Crystal Ski Resort", 656, 14, 5, true));
    }
    @org.junit.jupiter.api.Test
    public void testGetHotelList() {
        Assertions.assertEquals(8, manager.getHotelList().size());
    }
    @org.junit.jupiter.api.Test
    public void testAddHotel() {
        manager.addHotel(new ResortHotel("New Hotel", 100, 50, 3, 1, 1, 5));
        Assertions.assertEquals(9, manager.getHotelList().size());
    }
    @org.junit.jupiter.api.Test
    public void testFindHotelsWithTotalRoomsGreaterThan() {
        var result = manager.findHotelsWithTotalRoomsGreaterThan(50);
        Assertions.assertEquals(6, result.size());

        for (var hotel: result) {
            assertTrue(hotel.getTotalRooms() > 50);
        }
    }
    @Test
    public void testFindHotelsWithRatingGreaterThan() {
        Assertions.assertEquals(5, manager.findHotelsWithRatingGreaterThan(3).size());
    }
}

