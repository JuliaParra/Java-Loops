package dev.julia;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class MultiplicationTableTest {

    @Test
    public void testGenerateMultiplicationTable() {
        int number = 5;
        String[] expectedResults = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };

        List<String> results = MultiplicationTable.generateMultiplicationTable(number);
        
        for (int i = 0; i < expectedResults.length; i++) {
            System.out.println(results.get(i)); // Print result
            assertEquals(expectedResults[i], results.get(i), 
                "Error in the multiplication table at index " + (i + 1));
        }
    }
}