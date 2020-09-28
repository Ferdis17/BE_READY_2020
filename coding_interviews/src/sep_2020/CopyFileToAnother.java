package sep_2020;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileToAnother {

    public static void main(String[] args) throws IOException {
        FileInputStream origin = new FileInputStream("/Users/Ferdis/Documents/greeting.txt");
        FileOutputStream destination = new FileOutputStream("/Users/Ferdis/Desktop/copyFile.txt", true);

        int b;
        while ((b = origin.read()) != -1)
            destination.write(b);
    }
}
