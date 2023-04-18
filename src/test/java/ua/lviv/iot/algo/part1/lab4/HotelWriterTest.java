package ua.lviv.iot.algo.part1.lab4;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.Assert.*;

public class HotelWriterTest {
    private static final String EMPTY_FILENAME = "emptyFile.csv";
    private static final String RESULT_FILENAME = "actualFile.csv";
    @Test
    public void WriteToFileEmptyListTest() {
        HotelWriter writer = new HotelWriter();
        writer.write();
        File file = new File(EMPTY_FILENAME);
        Assertions.assertFalse(file.exists());
    }
    @Test
    public void ResultFileExistsTest() {
        File file = new File(RESULT_FILENAME);
        Assertions.assertTrue(file.exists());
    }
    @Test
    public void WritingToFileTest() throws IOException {

        HotelManager hotelManager = new HotelManager();

        hotelManager.addHotel(new ResortHotel("Beach Resort", 300, 150, 4, 2, 1, 7));
        hotelManager.addHotel(new ResortHotel("Grand Resort", 500, 200, 5, 3, 2, 10));

        hotelManager.addHotel(new Motel("Highway Motel", 50, 25, 3, "M4", "280 km", "Kyiv-Lviv"));
        hotelManager.addHotel(new Motel("Country Motel", 30, 15, 2, "M7", "126 km", "Vinnytsia-Odessa"));

        hotelManager.addHotel(new BeachHotel("Marriott", 150, 62, 4, true));
        hotelManager.addHotel(new BeachHotel("Hilton", 80, 22, 3, false));

        hotelManager.addHotel(new MountainHotel("Winter holidays", 488, 70, 5, true));
        hotelManager.addHotel(new MountainHotel("Ice Crystal Ski Resort", 656, 14, 5, true));

        HotelWriter hotelWriter = new HotelWriter();

        String actualFileName = hotelWriter.WriteToFile(hotelManager.getHotelList(), "actualFile.csv");


        try (BufferedReader expectedReader = new BufferedReader(new FileReader("expectedFile.csv"));
             BufferedReader actualReader = new BufferedReader(new FileReader(actualFileName))) {
            String expectedLine = expectedReader.readLine();
            String actualLine = actualReader.readLine();
            while (expectedLine != null && actualLine != null) {
                assertEquals(expectedLine, actualLine);
                expectedLine = expectedReader.readLine();
                actualLine = actualReader.readLine();
            }
        } finally {
            FileWriter writer = new FileWriter(actualFileName, false);
            writer.write("");
            writer.close();
        }
    }
}







