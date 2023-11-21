package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testFromExample() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        String[][] actual = App.enlargeArrayImage(image);
        String[][] expected = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(actual).isDeepEqualTo(expected);
    }

    @Test
    void testFromSolved() {
        String[][] image3 = {
                {"@", "@"},
                {"@", "|"},
                {"—", "|"},
                {"@", "|"},
                {"@", "@"},
        };

        String[][] enlargedImage3 = {
                {"@", "@", "@", "@"},
                {"@", "@", "@", "@"},
                {"@", "@", "|", "|"},
                {"@", "@", "|", "|"},
                {"—", "—", "|", "|"},
                {"—", "—", "|", "|"},
                {"@", "@", "|", "|"},
                {"@", "@", "|", "|"},
                {"@", "@", "@", "@"},
                {"@", "@", "@", "@"},
        };

        String[][] actual3 = App.enlargeArrayImage(image3);
        assertThat(actual3).isDeepEqualTo(enlargedImage3);
    }
}
// END
