public class Item {

    private double value;

    public Item(double value) {
        this.value = value;
    }

    public Double salesTax() {
        Double tax = (10.0 * value)/100;
        return tax;
    }
}
