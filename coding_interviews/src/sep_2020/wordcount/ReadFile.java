package sep_2020.wordcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String content = Files.readString(Path.of("/Users/Ferdis/BE_READY_2020/coding_interviews/src/sep_2020/wordcount/Paragraph.txt"));
//        String content = Files.lines(Paths.get("/Users/Ferdis/BE_READY_2020/coding_interviews/src/sep_2020/wordcount/Paragraph.txt"), StandardCharsets.UTF_8).collect(Collectors.joining());
//        System.out.println(content);

        content = content.replaceAll("[^a-zA-Z0-9]", " ");
        String [] textArray = content.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String s : textArray) {
            if(!map.containsKey(s)){
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        System.out.println(content);
    }



}
