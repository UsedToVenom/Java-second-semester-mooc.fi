
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
public class Hand implements Comparable<Hand>{
    
    private List<Card> inHand;

    public Hand() {
        inHand = new ArrayList();
    }

    public List<Card> getInHand() {
        return inHand;
    }
    
    
    public void add(Card card){
        inHand.add(card);
    }
    
    public void print(){
        inHand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Collections.sort(inHand);
        print();
    }

    @Override
    public int compareTo(Hand arg0) {
        return getInHand().stream().mapToInt(card -> card.getValue()).sum()
                - arg0.getInHand().stream().mapToInt(card -> card.getValue()).sum();
    }
    
    public void sortBySuit(){
        Comparator bySuit = new BySuitInValueOrder();
        Collections.sort(inHand, bySuit);
        print();
    }
    
}
