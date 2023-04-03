import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public String findMinOrMax(List<String> strings) throws EmtyListExeption {
        if (strings.isEmpty()) throw new EmtyListExeption();
        String shortest = strings.get(0);
        int indexShortest = 0;
        String longest = strings.get(0);
        int indexLongest = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < shortest.length()) {
                shortest = strings.get(i);
                indexShortest = i;
            } else if (strings.get(i).length() > longest.length()) {
                longest = strings.get(i);
                indexLongest = i;
            }
        }
        if (indexShortest < indexLongest) {
            return shortest;
        }

        return longest;
    }
}