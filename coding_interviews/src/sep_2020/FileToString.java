package sep_2020;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileToString {

    public static void main(String[] args) throws IOException {
        //with java 8 just one line.
        String content = Files.lines(Paths.get("/Users/Ferdis/Documents/greeting.txt"), StandardCharsets.UTF_8).collect(Collectors.joining());
        System.out.println(content);

        // java 7 guess is better
        String contents = new String(Files.readAllBytes(Paths.get("/Users/Ferdis/Documents/greeting.txt")));
        System.out.println(contents);

    }
}
