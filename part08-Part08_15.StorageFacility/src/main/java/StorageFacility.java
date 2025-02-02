
import java.util.ArrayList;
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> boxes;

    public StorageFacility() {
        boxes = new HashMap();
    }

    public void add(String unit, String item) {
        if (!boxes.containsKey(unit)) {
            boxes.put(unit, new ArrayList());
        }
        boxes.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return boxes.getOrDefault(storageUnit, new ArrayList());
    }

    public void remove(String storageUnit, String item) {
        if (!boxes.containsKey(storageUnit)) {
            return;
        }
        if (boxes.get(storageUnit).isEmpty()) {
            boxes.remove(storageUnit);
            return;
        }
        boxes.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> results = new ArrayList();
        for (String unit : boxes.keySet()) {
            if (boxes.get(unit).isEmpty()) {
                continue;
            }
            results.add(unit);
        }
        return results;
    }
}
