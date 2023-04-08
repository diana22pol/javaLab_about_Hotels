package ua.lviv.iot.algo.part1.lab3;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HotelManagerTest {
    private static final HotelManager manager = new HotelManager();
    @BeforeClass
    public static void setUp() {
        manager.addHotel(new ResortHotel("Beach Resort", 300, 150, 4, 2, 1, 7));
        manager.addHotel(new ResortHotel("Grand Resort", 500, 200, 5, 3, 2, 10));

        manager.addHotel(new Motel("Highway Motel", 50, 25, 3, "M4", "280 km", "Kyiv-Lviv"));
        manager.addHotel(new Motel("Country Motel", 30, 15, 2, "M7", "126 km", "Vinnytsia-Odessa"));

        manager.addHotel(new BeachHotel("Marriott", 150, 62, 4, true));
        manager.addHotel(new BeachHotel("Hilton", 80, 22, 3, false));

        manager.addHotel(new MountainHotel("Winter holidays", 488, 70, 5, true));
        manager.addHotel(new MountainHotel("Ice Crystal Ski Resort", 656, 14, 5, true));
    }
    @Test
    public void testGetHotelList() {
        assertEquals(9, manager.getHotelList().size());
    }
    @Test
    public void testAddHotel() {
        manager.addHotel(new ResortHotel("New Hotel", 100, 50, 3, 1, 1, 5));
        assertEquals(9, manager.getHotelList().size());
    }
    @Test
    public void testFindHotelsWithTotalRoomsGreaterThan() {
        assertEquals(7, manager.findHotelsWithTotalRoomsGreaterThan(50).size());
    }
    @Test
    public void testFindHotelsWithRatingGreaterThan() {
        assertEquals(5, manager.findHotelsWithRatingGreaterThan(3).size());
    }

}

