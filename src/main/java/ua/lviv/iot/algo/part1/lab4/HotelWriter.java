package ua.lviv.iot.algo.part1.lab4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HotelWriter {

    public String WriteToFile(List<Hotel> hotelList, String fileName) throws IOException {
        String defaultFileName = "actualFile.csv";

        if (hotelList == null || hotelList.isEmpty()) {
            return null;
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(defaultFileName))) {
            for (Hotel hotel_value : hotelList) {
                bufferedWriter.write(hotel_value.getHeaders());
                bufferedWriter.newLine();
                bufferedWriter.write(hotel_value.toCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) { }

        return defaultFileName;
    }
    public void write() {}

}
