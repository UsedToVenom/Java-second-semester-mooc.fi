
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
public class Herd implements Movable {

    private ArrayList<Movable> members = new ArrayList();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Movable item : members) {
            builder.append(item.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    public void addToHerd(Movable movable) {
        members.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable item : members) {
            item.move(dx, dy);
        }
    }

}
