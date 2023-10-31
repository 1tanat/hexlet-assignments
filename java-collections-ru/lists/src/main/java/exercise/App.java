package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String task, String word) {
        word = word.toLowerCase();

        String[] letters = word.split("");
        String[] givenLetters = task.split("");

        List<String> stringList = Arrays.asList(givenLetters);
        List<String> newList = new ArrayList<>();
        newList.addAll(stringList);

        for (String letter : letters) {
            if (newList.contains(letter)) {
                newList.remove(letter);
            } else {
                return false;
            }
        }

        return true;
    }
}
