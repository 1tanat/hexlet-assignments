package exercise;

import java.util.Arrays;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] image1 = Arrays.stream(image)
                .map(App::duplicate)
                .toArray(String[][]::new);

        return Arrays.stream(image1)
                .flatMap(item -> Arrays.stream(new String[][] {item, item}))
                .toArray(String[][]::new);
    }

    public static String[] duplicate(String[] partImage) {
        return Arrays.stream(partImage)
                .flatMap(item -> Arrays.stream(new String[] {item, item}))
                .toArray(String[]::new);
    }
}
// END
