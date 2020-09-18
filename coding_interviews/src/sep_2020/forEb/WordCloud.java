package sep_2020.forEb;

import java.util.*;

public class WordCloud {

    public static Map<String, Integer> getWordCloud(String str) {
        if(str == null || str.length()==0) {
            return null;
        }
    String s = str.replaceAll("[^a-zA-Z0-9]", " ");
        List<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));

        Map<String, Integer> wordMap = new HashMap<>();

        for(String word: words){
            int count = 1;
            if(!wordMap.containsKey(word)){
                if(!word.isBlank()) {
                    wordMap.put(word, count);
                }
            }else {
                wordMap.put(word, count+1);
            }
        }
        return wordMap;
    }

    public static void main(String[] args) {
        System.out.println( getWordCloud("After beating the eggs,Dana read the next step:"));
    }
}
