/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Mąż
 */
public class TemperatureSensor implements Sensor {

    private boolean on;

    public TemperatureSensor() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setOn() {
        on = true;
    }

    @Override
    public void setOff() {
        on = false;
    }

    @Override
    public int read() {
        if (on) {
            return (int) (Math.random()*61-30);
        }else{
            throw new IllegalStateException();
        }
    }

}
