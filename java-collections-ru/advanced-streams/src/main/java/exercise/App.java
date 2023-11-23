package exercise;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String text) {
        String[] strings = text.split("\\R");
        return Arrays.stream(strings)
                .filter(x -> x.startsWith("environment"))
                .filter(x -> x.contains("X_FORWARDED_"))
                .map(x -> x.replaceAll("environment=", ""))
                .map(x -> x.replaceAll("\"", ""))
                .map(x -> x.split(","))
                .flatMap(Arrays::stream)
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
