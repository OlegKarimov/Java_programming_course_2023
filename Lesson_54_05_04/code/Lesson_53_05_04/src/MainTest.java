import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main m;

    @BeforeEach
    public void init() {
        m = new Main();
    }

    @Test
    public void testFindDom_noDominant() {
        int[] actual = {5, 5, 6, 5, 6, 6};
        assertEquals(-1, m.findDominant(actual));

    }


    @Test
    public void testFindDom_dominantExists() {
        int[] actual = {5, 5, 6, 5, 6, 6, 1, 2, 5, 5, 5, 5, 5, 5, 5, 5};
        assertEquals(5, m.findDominant(actual));

    }

    @Test
    public void testFindDom_dominantOne() {
        int[] actual = {5};
        assertEquals(5, m.findDominant(actual));

    }


    @Test
    public void testFindDom_dominant_twoDif() {
        int[] actual = {5, 6};
        assertEquals(-1, m.findDominant(actual));

    }

    @Test
    public void testFindDom_dominant_equal() {
        int[] actual = {6, 6};
        assertEquals(6, m.findDominant(actual));

    }

    @Test
    public void withoutDuplicates_test_oneElement() {
        List<String> actual = Arrays.asList("Jack");
        List<String> expected = Arrays.asList("Jack");

        assertEquals(expected, m.withoutDuplicates(actual));
    }

    @Test
    public void withoutDuplicates_test_noDuplicates() {
        List<String> expected = Arrays.asList("Ann", "John", "Jack", "Mary");
        List<String> actual = Arrays.asList("Jack", "John", "Mary", "Ann");

        assertEquals(expected, m.withoutDuplicates(actual));
    }

    @Test
    public void withoutDuplicates_test_removeDuplicates() {
        List<String> actual = Arrays.asList("Jack", "John", "Mary", "Ann", "Jack", "John");
        List<String> expected = Arrays.asList("Ann", "John", "Jack", "Mary");

        assertEquals(expected, m.withoutDuplicates(actual));
    }


    @Test
    public void duplicates_test_oneElt() {
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList();

        assertEquals(expected, m.duplicates(actual));
    }

    @Test
    public void duplicates_test_noDuplicates() {
        List<String> actual = Arrays.asList("John", "Jack", "Jill");
        List<String> expected = Arrays.asList();

        assertEquals(expected, m.duplicates(actual));
    }


    @Test
    public void duplicates_test_oneDuplicate() {
        List<String> actual = Arrays.asList("John", "Jack", "Jill", "Ann", "John", "Jack");
        List<String> expected = Arrays.asList("John", "Jack");

        assertEquals(expected, m.duplicates(actual));
    }


    @Test
    public void duplicates_test_three_Johns_three_Jacks() {
        List<String> actual = Arrays.asList("John", "Jack", "Jill", "Ann", "John", "Jack", "Jack", "John");
        List<String> expected = Arrays.asList("John", "Jack");

        assertEquals(expected, m.duplicates(actual));
    }


}