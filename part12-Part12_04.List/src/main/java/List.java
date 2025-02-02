/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mąż
 */
public class List<T> {

    private T[] array;
    private int lastFreeIndex;

    public List() {
        this.array = (T[]) new Object[10];
        this.lastFreeIndex = 0;
    }

    private void grow() {
        T[] output = (T[]) new Object[array.length * 3 / 2];
        for (int i = 0; i < lastFreeIndex; i++) {
            output[i] = array[i];
        }
        array = output;
    }

    public void add(T item) {
        if (lastFreeIndex == array.length) {
            grow();
        }
        array[lastFreeIndex] = item;
        lastFreeIndex++;
    }

    public boolean contains(T item) {
        return indexOfValue(item)>=0;
    }

    public T remove(T item) {
        int index = indexOfValue(item);
        if(index>=0){
            T value = array[index];
            array[index] = null;
            moveToTheLeft(index);
            return value;
        }
        else {
            throw new Null­Pointer­Exception("No such element: " + item);
        }

    }

    public int indexOfValue(T item) {
        for (int i = 0; i < lastFreeIndex; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int index) {
        for (int i=index; i==lastFreeIndex; i++){
            array[i] = array[i+1];
        }
        lastFreeIndex--;
    }
    
    public int size(){
        return lastFreeIndex;
    }
    
    public T value(int index){
        if(index>=0 && index<lastFreeIndex){
            return array[index];
        }
        else{
            throw new ArrayIndexOutOfBoundsException(index + " outside of  0-" + (lastFreeIndex-1));
        }
        
    }

    @Override
    public String toString() {
        String output = "";
        for(int i =0; i<lastFreeIndex; i++){
            output = output + " " + array[i];
        }
        return output;
    }
    
    
}
