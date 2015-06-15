import java.util.HashMap;
import java.util.Map;

public class InputParser {
    private Map<Item, Integer> itemList;

    public InputParser() {
        itemList = new HashMap<Item, Integer>();
    }

    public Map<Item, Integer> parse(String input) {
        Integer numOfItems = convertToInteger(input);
        Double itemValue = getValueOfItem(input);
        itemList.put(new Item(itemValue), numOfItems);
        return itemList;
    }

    private int convertToInteger(String input) {
        return Integer.parseInt(String.valueOf(input.charAt(0)));
    }

    public Double getValueOfItem(String input) {
        String[] list = input.split(" ");
        String lastElement = list[list.length - 1];
        Double value = Double.parseDouble(String.valueOf(lastElement));
        return value;
    }

    public boolean isImportedItem(String input) {
        String[] list = input.split(" ");
        String importConstant = "imported";
        return importConstant.equals(list[1]);
    }
}
