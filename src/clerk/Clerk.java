package clerk;

import item.Item;

import java.util.HashMap;
import java.util.Map;

public class Clerk {
    private final Map<String, Item> items = new HashMap<>();

    public Clerk() {
        Item Coffee = new Item("Coffee", 2500, "2022.08.01");
        Item Ade = new Item("Ade", 5000, "2022.08.01");
        Item Cake = new Item("Cake", 5500, "2022.08.01");
        items.put("Coffee", Coffee);
        items.put("Ade", Ade);
        items.put("Cake", Cake);
    }

    public Item order(String food, int price) {
        if (!items.containsKey(food)) {
            throw new ArrayStoreException("판매하지 않는 상품입니다.");
        } else if (price != getPrice(food)) {
            throw new IllegalArgumentException("금액이 맞지않습니다.");
        }
        return items.get(food);
    }

    public int getPrice(String desert) {
        if(!items.containsKey(desert)) {
            throw new IllegalArgumentException("메뉴판에 없는 메뉴입니다.");
        }
        return items.get(desert).getPrice();
    }
}

