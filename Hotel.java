import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Hotel {
    private String name;
    private int totalRooms;
    private int availableRooms;
    private int rating;

    private static Hotel instance = new Hotel();
    public static Hotel getInstance() {
        return instance;
    }

     public void bookRooms() {

        System.out.println("bookRooms() method: ");

        System.out.println("Available rooms - " + availableRooms);
        if(availableRooms > 0 || availableRooms < totalRooms) {
            availableRooms -= 1;
            System.out.println("Booked! - " + (availableRooms) + "\n");
        } else {
            System.out.println("There are not available rooms to book! " + "\n");
        }
    }
     public void releaseRooms() {

        System.out.println("releaseRooms() method: ");

        System.out.println("Available rooms - " + availableRooms);
        if(availableRooms < totalRooms) {
            availableRooms += 1;
            System.out.println("Unbooked! - " + (availableRooms) + "\n");
        }
    }
    public int getBookedRoomsCount() {
        System.out.println("getBookedRooms() method: ");

        int bookedRooms =  totalRooms - availableRooms;
        System.out.println("Number of Booked Rooms - " + (bookedRooms) + "\n");
        return bookedRooms;
    }
    public int getAvailableRoomsCount() {
        System.out.println("getAvailableRooms() method: ");

        System.out.println("AvailableRooms - " + (availableRooms) + "\n");
        return availableRooms;
    }
    public static void main(String[] args) {

        Hotel hotel0 = new Hotel();

        Hotel hotel1 = new Hotel("Grand Hotel", 100, 50, 4);

        Hotel hotel2 = Hotel.getInstance();
        hotel2.setName("Jumeirah Beach Hotel");
        hotel2.setRating(5);
        hotel2.setTotalRooms(600);
        hotel2.setAvailableRooms(250);

        Hotel hotel3 = Hotel.getInstance();

        Hotel[] hotels = {hotel0, hotel1, hotel2, hotel3};

        for (int i = 0; i < hotels.length; i++) {
            System.out.println(i + " " + hotels[i] + "\n");
        }

        hotel2.bookRooms();
        hotel2.releaseRooms();
        hotel2.getAvailableRoomsCount();
        hotel2.getBookedRoomsCount();
    }
}

