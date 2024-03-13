import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;

class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String[] words) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        return wordFrequency;
    }

    public static List<String> findRarestWords(Map<String, Integer> wordFrequency) {
        List<String> rarestWords = new ArrayList<>();
        int minFrequency = Collections.min(wordFrequency.values());
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == minFrequency) {
                rarestWords.add(entry.getKey());
            }
        }
        return rarestWords;
    }
}