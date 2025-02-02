
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
public class IOU {
    
    private HashMap<String, Double> ious;

    public IOU() {
        ious = new HashMap();
    }
    

    public void setSum(String toWhom, double amount) {
        double cash = ious.getOrDefault(toWhom, 0.0);
        ious.put(toWhom, cash+amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return ious.getOrDefault(toWhom, 0.0);
    }

}
