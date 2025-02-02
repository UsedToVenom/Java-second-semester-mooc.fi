
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
public class Pipe<T> {

    private ArrayList<T> list;

    public Pipe() {
        list = new ArrayList();
    }
    
    

    public void putIntoPipe(T value) {
        list.add(value);
    }

    public T takeFromPipe() {
        try {            
            return list.remove(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public boolean isInPipe() {
        return !list.isEmpty();
    }

}
