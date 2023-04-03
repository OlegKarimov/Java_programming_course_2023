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

    @org.junit.jupiter.api.Test
    void mapAB() {

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a", "Hi");
        inputMap.put("b", "There");
        inputMap.put("c", "Hi hi");

        Map<String, String> resMap = new HashMap<>();
        inputMap.put("a", "Hi");
        inputMap.put("b", "There");
        inputMap.put("c", "Hi hi");

        assertEquals(resMap, inputMap);
    }

    @org.junit.jupiter.api.Test
    void wordMultiple() {
        String[] stringsIn = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> outStringMap = null;
        outStringMap.put("a", true);
        outStringMap.put("b", true);
        outStringMap.put("c", false);

        assertEquals(outStringMap, stringsIn);
    }

    @org.junit.jupiter.api.Test
    void nameToNumberOccurence() {
        List<String> list = new ArrayList<>();
        list.add("Вася");
        list.add("Олег");
        list.add("Петя");
        list.add("Коля");
        list.add("Олег");

        assertEquals(2, m.nameToNumberOccurence(list, "Олег"));
    }
}