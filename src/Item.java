public class Item {

    private double value;

    public Item(double value) {
        this.value = value;
    }

    public Double salesTax() {
        return calculateTaxValue(10.0);
    }

    private Double precision(Double value) {
        return Math.round(value * 20.0) / 20.0;
    }

    public Double noTax() {
        return 0.0;
    }

    public Double importTaxWithSalesTax() {
        return calculateTaxValue(15.0);
    }

    private Double calculateTaxValue(Double taxPercentage) {
        Double tax = (taxPercentage * value) / 100;
        return precision(tax);
    }

    public Double importTaxWithOutSalesTax() {
        return calculateTaxValue(5.0);
    }
}
