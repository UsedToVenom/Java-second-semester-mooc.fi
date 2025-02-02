
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
public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> content;

    public Box(double capacity) {
        this.capacity = capacity;
        this.content = new ArrayList();
    }

    public double weight() {
        double total = 0.0;
        for (Packable item : content) {
            total += item.weight();
        }
        return total;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= capacity) {
            content.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + content.size() + " items, total weight " + weight() + " kg";
    }
}

    
    
    

