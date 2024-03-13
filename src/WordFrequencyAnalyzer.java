import java.util.Map;
import java.util.List;
import java.io.IOException;

public class WordFrequencyAnalyzer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Використання: java WordFrequencyAnalyzer <ім'я_файлу>");
            return;
        }

        String filename = args[0];
        try {
            String[] words = FileReaderHelper.readWords(filename);
            Map<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(words);
            List<String> rarestWords = WordFrequencyCounter.findRarestWords(wordFrequency);
            System.out.println("Найрідші слова: " + rarestWords);
        } catch (IOException e) {
            System.err.println("Помилка читання файлу: " + e.getMessage());
        }
    }
}