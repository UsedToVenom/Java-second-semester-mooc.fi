
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
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        registry = new HashMap();
    }
    
    
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(registry.containsKey(licensePlate)&&(registry.get(licensePlate)!=null)){
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){        
        return registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(registry.containsKey(licensePlate)){
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate element : registry.keySet()){
            System.out.println(element);
        }
    }
    
    public void printOwners(){
        ArrayList <String> printed = new ArrayList();
        for(String owner : registry.values()){
            if(!printed.contains(owner)){
                System.out.println(owner);
                printed.add(owner);
            }
        }
    }
    
}
