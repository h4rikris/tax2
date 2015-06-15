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
        String[] list = splitInput(input);
        String lastElement = list[list.length - 1];
        Double value = Double.parseDouble(String.valueOf(lastElement));
        return value;
    }

    public boolean isImportedItem(String input) {
        String[] list = splitInput(input);
        String importConstant = "imported";
        return importConstant.equals(list[1]);
    }

    private String[] splitInput(String input) {
        return input.split(" ");
    }

    public boolean isFoodItem(String input) {
        String[] list = splitInput(input);
        String foodConstant = "chocolates";
        String anotherFoodConstant = "chocolate";
        for (int i = 0; i < list.length; i++) {
            if (foodConstant.equals(list[i])) {
                return true;
            }
            if (anotherFoodConstant.equals(list[i]))
                return true;
        }
        return false;
    }
}
