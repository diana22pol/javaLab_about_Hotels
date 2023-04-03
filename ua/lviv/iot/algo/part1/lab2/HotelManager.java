package lab2_level2;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
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

    public void getAllHotels() {
        //
        for (Hotel object : hotelList) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {

        HotelManager manager = new HotelManager();

        manager.addHotel(new ResortHotel("Beach Resort", 300, 150, 4, 2, 1, 7));
        manager.addHotel(new ResortHotel("Grand Resort", 500, 200, 5, 3, 2, 10));

        manager.addHotel(new Motel("Highway Motel", 50, 25, 3, "M4", "280 km", "Kyiv-Lviv"));
        manager.addHotel(new Motel("Country Motel", 30, 15, 2, "M7", "126 km", "Vinnytsia-Odessa"));

        manager.addHotel(new BeachHotel("Marriott", 150, 62, 4, true));
        manager.addHotel(new BeachHotel("Hilton", 80, 22, 3, false));

        manager.addHotel(new MountainHotel("Winter holidays", 488, 70, 5, true));
        manager.addHotel(new MountainHotel("Ice Crystal Ski Resort", 656, 14, 5, true));

        manager.getAllHotels();
        System.out.println();

        System.out.println("Hotels with total rooms greater than 40:");
        manager.findHotelsWithTotalRoomsGreaterThan(40).forEach(h -> System.out.println(h.getName()));
        System.out.println();

        System.out.println("Hotels with rating greater than 3:");
        manager.findHotelsWithRatingGreaterThan(3).forEach(h -> System.out.println(h.getName()));
    }
}