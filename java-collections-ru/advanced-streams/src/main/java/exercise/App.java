package exercise;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
class App {
    public static String getForwardedVariables(String text) {
        //String[] strings = text.split("\\R");
        String[] asf = Stream.of(text.split("\\R"))
                .filter(x -> x.startsWith("environment"))
                .filter(x -> x.contains("X_FORWARDED_"))
                .map(x -> x.replaceAll("environment=", ""))
                .map(x -> x.replaceAll("\"", ""))
                .toArray(String[]::new);

        String asf2 = Arrays.toString(asf);
        asf2 = asf2.replace("[", "").replace("]", "");

        String[] asf1 = Stream.of(asf2.split(","))
                .map(x -> x.replaceAll(" ", ""))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .peek(System.out::println)
                .toArray(String[]::new);

        String result = Arrays.toString(asf1);
        result = result.replace("[", "").replace("]", "").replace(" ", "");

        return result;

    }
}
//END
