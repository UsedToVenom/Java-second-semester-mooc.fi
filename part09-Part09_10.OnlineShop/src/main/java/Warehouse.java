
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mąż
 */
public class Warehouse { 
    
    private Map<String, Integer> products;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.products = new HashMap();
        this.stock = new HashMap();
    }
    
    
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        this.stock.put(product,stock);
    }
    
    public int stock(String product){
        if(stock.containsKey(product)){
            return stock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(stock.containsKey(product)){
            if(stock.get(product)>=1){
                stock.put(product, stock.get(product)-1);
                return true;
            }
        }
        return false;
    }
    
    public int price(String product){
        if(products.containsKey(product)){
            return products.get(product);
        }
        return -99;
    }
    
    public Set<String> products(){
        return stock.keySet();
    }
    
}
