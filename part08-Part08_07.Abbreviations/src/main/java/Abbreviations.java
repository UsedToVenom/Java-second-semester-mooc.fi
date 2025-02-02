
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mąż
 */
public class Abbreviations {

    private HashMap<String, String> dictionary = new HashMap();

    public void addAbbreviation(String abbreviation, String explanation) {
        if (!dictionary.containsKey(abbreviation)) {
            dictionary.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return dictionary.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        //String output = dictionary.get(abbreviation)==null?"":dictionary.get(abbreviation);
        return dictionary.get(abbreviation);
    }

}
