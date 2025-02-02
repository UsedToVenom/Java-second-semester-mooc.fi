
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mąż
 */
public class BoxWithMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> content;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.content = new ArrayList();
    }
    
    private int getTotalWeight(){
        int total = 0;
        for(Item item:content){
            total+=item.getWeight();
        }
        return total;
    }

    @Override
    public void add(Item item) {
        if (getTotalWeight() + item.getWeight()<=capacity){
            content.add(item);
        }    
    }

    @Override
    public boolean isInBox(Item item) {
        return content.contains(item);
    }
    
    
    
    
    
}
