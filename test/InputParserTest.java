import org.junit.Test;

import java.util.Map;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class InputParserTest {

    @Test
    public void shouldAbleToParseNumberOfItems() {
        InputParser inputParser = new InputParser();

        Map<Item, Integer> items = inputParser.parse("1 book at 12.49");

        assertTrue(items.containsValue(1));
    }

    @Test
    public void shouldAbleToParseValueOfItem() {
        InputParser inputParser = new InputParser();

        Double valueOfItem = inputParser.getValueOfItem("1 book at 12.49");

        assertEquals(12.49, valueOfItem, 0.0d);
    }
}