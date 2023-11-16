package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static long getCountOfFreeEmails(List<String> input) {
        return input.stream()
                .filter(email -> email.endsWith("gmail.com")
                || email.endsWith("hotmail.com")
                || email.endsWith("yandex.ru"))
                .count();
    }
}
// END
