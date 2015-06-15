import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void shouldAbleToCalculateTaxValueOfNormalItem() {
        Item item = new Item(14.99);

        Double tax = item.salesTax();

        assertEquals(1.5, tax, 0.0d);
    }

    @Test
    public void shouldCalculateTaxValueWithPrecision() {
        Item item = new Item(14.99);

        Double tax = item.salesTax();

        assertEquals(1.50, tax, 0.0d);
    }
}