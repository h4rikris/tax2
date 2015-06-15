import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void shoudlCalculateTaxValueOfNonTaxableItem() {
        Item item = new Item(14.99);

        Double tax = item.noTax();

        assertEquals(0.0, tax, 0.0d);
    }

    @Test
    public void shouldCalculateTaxValueOfImportedTaxableItem() {
        Item item = new Item(47.50);

        Double tax = item.importTaxWithSalesTax();

        assertEquals(7.15, tax, 0.0d);
    }

    @Test
    public void shouldCalculateTaxValueOfImportedNonTaxableItem() {
        Item item = new Item(10.00);

        Double tax = item.importTaxWithOutSalesTax();

        assertEquals(0.50, tax, 0.0d);
    }
}