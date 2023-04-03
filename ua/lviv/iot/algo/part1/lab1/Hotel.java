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
    public static Hotel getInstance() { return instance; }

     public void bookRooms() {

        if(availableRooms > 0) {
            availableRooms -= 1;
        }
    }
    
     public void releaseRooms() {
     
        if(availableRooms < totalRooms) {
            availableRooms += 1;
        }
    }
    
    public int getBookedRoomsCount() {
       
       int bookedRooms =  totalRooms - availableRooms;
       return bookedRooms;
    }
    
    public int getAvailableRoomsCount() {
        
        return availableRooms;
    }
    
    public static void main(String[] args) {
    
        Hotel[] hotels = {new Hotel(), 
                new Hotel("Grand Hotel", 100, 50, 4), 
                Hotel.getInstance(), 
                Hotel.getInstance()
        };
        
        for(Hotel object : hotels){
            System.out.println(object);
        }
    }
}

