
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mąż
 */
public class ShoppingCart {

    private Map<String, Item> content;

    public ShoppingCart() {
        this.content = new HashMap();
    }

    public void add(String product, int price) {
        if (content.containsKey(product)) {
            content.get(product).increaseQuantity();
        } else {
            content.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item item : content.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Item item : content.values()) {
            System.out.println(item);
        }
    }

}
