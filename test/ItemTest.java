import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void shouldAbleToCalculateTaxValueOfNormalItem() {
        Item item = new Item(14.99);

        Double tax = item.salesTax();

        assertEquals(1.499, tax, 0.0d);
    }
}