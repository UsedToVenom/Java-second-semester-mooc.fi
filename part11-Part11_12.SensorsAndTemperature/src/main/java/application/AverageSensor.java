/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mąż
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors = new ArrayList();
    private List<Integer> readings = new ArrayList();

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    @Override
    public boolean isOn() {
        if (sensors.isEmpty()) {
            return false;
        }
        for (Sensor sensor : sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (isOn()) {
//            Double number =  sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
//            return number.intValue();
            int reading = (int) sensors.stream().mapToInt(sensor -> sensor.read()).average().orElse(0.0);
            readings.add(reading);
            return reading;
        }
        else{
            throw new IllegalStateException();
        }
    }
    
    public List<Integer> readings(){
        return readings;
    }

}
