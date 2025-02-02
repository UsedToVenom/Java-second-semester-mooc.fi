
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
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        history = new ArrayList();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double max = history.get(0);
        for (double number : history) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }
        double min = history.get(0);
        for (double number : history) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for(double number: history){
            sum += number;
        }
        
        return sum/history.size();
    }

}
