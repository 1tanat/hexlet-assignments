package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = sentence.split(" ");
        int count = 0;

        if (!sentence.equals("")) {
            for (String word1 : words) {
                for (String word2 : words) {
                    if (word1.equals(word2)) {
                        count += 1;
                    }
                }
                wordCount.put(word1, count);
                count = 0;
            }
        }

        return wordCount;
    }

    public static String toString(Map<String, Integer> wordCount) {
        StringBuilder text = new StringBuilder();

        if (!wordCount.isEmpty()) {
            text.append("{\n");
            for (Map.Entry<String, Integer> word : wordCount.entrySet()) {
                text.append("  " + word.getKey() + ": " + word.getValue() + "\n");
            }
            text.append("}");
        } else {
            text.append("{}");
        }

        return text.toString();
    }
}
//END
