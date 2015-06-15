public class Item {

    private double value;

    public Item(double value) {
        this.value = value;
    }

    public Double salesTax() {
        Double tax = (10.0 * value) / 100;
        return precision(tax);
    }

    private Double precision(Double value) {
        return Math.round(value * 20.0) / 20.0;
    }

    public Double noTax() {
        return 0.0;
    }

    public Double importTaxWithSalesTax() {
        Double tax = (15.0 * value) / 100;
        return precision(tax);
    }
}
