/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mąż
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }
    
    public String history() {
        return history.toString();
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double toHistory = super.takeFromWarehouse(amount);
        history.add(this.getBalance());
        return  toHistory;
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(this.getBalance());//To change body of generated methods, choose Tools | Templates.
    }
    
    public void printAnalysis(){
        String output = "Product: %s\nHistory: %s\nLargest amount of product: %f\nSmallest amount of product: %f\nAverage: %f";
        System.out.println(String.format(output, this.toString(), history.toString(), history.maxValue(), history.minValue(), history.average()));
    }
    
    
    
    
}
