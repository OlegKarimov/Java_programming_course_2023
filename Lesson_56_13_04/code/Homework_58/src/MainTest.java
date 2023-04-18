import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private Main mainTest;
    String input;
    Predicate<String> predicate;
    Function<String, String> function;

    @BeforeEach
    public void init() {
        mainTest = new Main();
        input = "AAA BbBB dEF cDkls bbb";
    }

    @Test
    void testEmpty() {
        String expectet = "";
        predicate = s -> s.length() == 3;
        function = s -> s.toLowerCase();
        assertEquals(expectet, mainTest.changeString(input, predicate, function));

    }
}