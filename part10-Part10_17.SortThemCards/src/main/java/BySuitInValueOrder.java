
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mąż
 */
public class BySuitInValueOrder implements Comparator <Card> {

    @Override
    public int compare(Card card1, Card card2) {
        Comparator<Card> compare = Comparator.comparing(Card::getSuit)
                    .thenComparing(Card::getValue);
        return compare.compare(card1, card2);
    }
    
    
    
}
