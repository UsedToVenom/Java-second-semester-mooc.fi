
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mąż
 */
public class MyMap<K, V> {

    private ArrayList<Pair<K, V>>[] array;
    private int numberOfElements;

    public MyMap() {
        this.array = new ArrayList[1];
        this.numberOfElements = 0;
    }

    private void grow() {
        ArrayList<Pair<K, V>>[] newArray = new ArrayList[2 * array.length];
        for (int i = 0; i < array.length; i++) {
            copy(newArray, i);
        }
        System.out.println("I Grow Stronger! length = " + newArray.length);
        this.array = newArray;
    }

    private void copy(ArrayList[] newArray, int arrayIndex) {
        if (!indexIsEmpty(arrayIndex)) {
            for (int i = 0; i < array[arrayIndex].size(); i++) {
                Pair pair = array[arrayIndex].get(i);
                int newIndex = pair.getKey().hashCode() % newArray.length;
                if (newArray[newIndex] == null) {
                    newArray[newIndex] = new ArrayList();
                }
                newArray[newIndex].add(pair);
            }
        }
    }

    public void add(Pair<K, V> pair) {
        if (1.0 * numberOfElements >= 0.75 * array.length) {
            grow();
        }
        int indexOfPair = pair.getKey().hashCode() % array.length;
        if (!indexIsEmpty(indexOfPair)) {
            int indexToUpdate = indexToUpdate(indexOfPair, pair);
            if (indexToUpdate >= 0) {
                array[indexOfPair].get(indexToUpdate).setValue(pair.getValue());
                System.out.println("replaced old");
            } else {
                array[indexOfPair].add(pair);
                numberOfElements++;
                System.out.println("added new");
            }
        } else {
            array[indexOfPair] = new ArrayList();
            System.out.println("will reccur");
            add(pair);

        }

    }

    public void remove(K key) {
        int index = key.hashCode()%array.length;
        if(!indexIsEmpty(index)){
            for(int i = 0; i<array[index].size(); i++){
                if(array[index].get(i).getKey().equals(key)){
                    array[index].remove(i);
                    System.out.println("removed key: " + key);
                }
            }
        }
    }

    private int indexToUpdate(int indexInArray, Pair pair) {
        if (array[indexInArray] == null) {
            return -1;
        }
        for (int i = 0; i < array[indexInArray].size(); i++) {
            if (pair.getKey().equals(array[indexInArray].get(i).getKey())) {
                System.out.println("Found " + array[indexInArray].get(i).getKey() + " key equal to " + pair.getKey());
                return i;
            }
        }
        return -1;
    }

    private boolean indexIsEmpty(int index) {
        return array[index] == null;
    }

}
