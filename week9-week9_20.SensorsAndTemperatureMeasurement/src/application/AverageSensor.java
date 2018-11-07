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
 * @author feihua
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    
    private List<Integer> readingList;

    public AverageSensor() {
        sensorList = new ArrayList<Sensor>();
        readingList= new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional) {
        sensorList.add(additional);
    }

    public boolean isOn() {
        boolean status=true;
        for (Sensor sensor : sensorList) {
            if (sensor.isOn() == false) {
                status = false;
            }
        }
        return status;
    }

    public void on() {
        if (!this.isOn()) {
            for (Sensor sensor : sensorList) {
                sensor.on();
            }
        }

    }

    public void off() {
        for (Sensor sensor : sensorList) {
            sensor.off();
        }

    }

    public int measure() {
        int result;
        if (this.isOn()) {
            int sum = 0;
            for (Sensor sensor : sensorList) {
                sum = sum + sensor.measure();

            }
            result=sum / sensorList.size();
            readingList.add(result);
            return result;
        }else
            throw new IllegalStateException();
    }
    
    public List<Integer> readings(){
        return readingList;
        
    }

}
