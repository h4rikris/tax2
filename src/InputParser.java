import java.util.HashMap;
import java.util.Map;

public class InputParser {
    private Map<Item, Integer> itemList;

    public InputParser() {
        itemList = new HashMap<Item, Integer>();
    }

    public Map<Item, Integer> parse(String input) {
        Integer numOfItems = Integer.parseInt(String.valueOf(input.charAt(0)));
        itemList.put(new Item(0.0), numOfItems);
        return itemList;
    }
}
