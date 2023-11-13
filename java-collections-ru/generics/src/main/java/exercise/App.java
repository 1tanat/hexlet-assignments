package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> search) {
        boolean here = true;
        boolean here1 = true;
        List<Map<String, String>> foundBooks = new ArrayList<>();

        for (Map<String, String> book : books) {
            for (Map.Entry<String, String> thing : search.entrySet()) {
                here = (book.containsValue(thing.getValue()));
                if (!here) {
                    here1 = false;
                }
            }
            if (here1) {
                foundBooks.add(book);
            }
            here1 = true;
        }

        return foundBooks;
    }
}
//END
