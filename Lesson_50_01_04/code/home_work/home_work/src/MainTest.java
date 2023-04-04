import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    private Main m;

    @BeforeEach
    public void init() {
        m = new Main();
    }

    @Test
    void mapAB_test() {

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a", "Hi");
        inputMap.put("b", "There");
        inputMap.put("c", "Hi hi");

        Map<String, String> resMap = new HashMap<>();
        resMap.put("a", "Hi");
        resMap.put("ab", "HiThere");
        resMap.put("b", "There");
        resMap.put("c", "Hi hi");

        assertEquals(resMap, m.mapAB(inputMap));
    }

    @Test
    void wordMultiple_test() {
        String[] stringsIn = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> outStringMap = new HashMap<>();
        outStringMap.put("a", true);
        outStringMap.put("b", true);
        outStringMap.put("c", false);

        assertEquals(outStringMap, m.wordMultiple(stringsIn));
    }

    @Test
    void nameToNumberOccurence_test() {
        List<String> list = new ArrayList<>();
        list.add("Вася");
        list.add("Олег");
        list.add("Петя");
        list.add("Коля");
        list.add("Олег");

        assertEquals(2, m.nameToNumberOccurence(list, "Олег"));
    }
}