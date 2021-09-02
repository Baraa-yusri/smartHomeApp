/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author baraa
 */
public class Location implements Serializable{
    private int locationId;
    private String abnormalMessage;
    private boolean abnormal;
    ArrayList<Sensor> sensors;
    public Location() {
        locationId=0;
        abnormalMessage="";
        abnormal = false;
        sensors = new ArrayList<Sensor>();
        
    }

    public Location(ArrayList<Sensor> sensors){
            this.sensors = sensors;
            this.locationId = 0;
            abnormalMessage="";
            abnormal = false;
    }
    
    public Location(int locationID) {
        this.locationId = locationID;
        abnormalMessage="";
        abnormal = false;
        sensors = new ArrayList<Sensor>();

    }

    public int getLocationId() {
        return locationId;
    }

    public String getAbnormalMessage() {
        return abnormalMessage;
    }

    public boolean isAbnormal() {
        return abnormal;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public void setAbnormalMessage(String abnormalMessage) {
        this.abnormalMessage = abnormalMessage;
    }

    public void setAbnormal(boolean abnormal) {
        this.abnormal = abnormal;
    }

    public void setSensors(ArrayList<Sensor> sensors) {
        this.sensors = sensors;
    }
    

    public void checkSensorsValues(){
        float temp = sensors.get(0).sensorData()[0];
        float luminous = sensors.get(1).sensorData()[0];
        float radiometry = sensors.get(1).sensorData()[1];
        float absHumidity = sensors.get(2).sensorData()[0];
        float relHumidity = sensors.get(2).sensorData()[1];
        if(temp>sensors.get(0).getMaxSensorRange() && (luminous>sensors.get(1).getMaxSensorRange() || radiometry>sensors.get(1).getMaxSensorRange())
                &&sensors.get(0).isActive()&&sensors.get(1).isActive()){
            abnormalMessage= " Abnnormal Tempreture ";
            abnormal=true;
        }
        else if(temp>sensors.get(0).getMaxSensorRange() && (absHumidity>sensors.get(2).getMaxSensorRange() || relHumidity>sensors.get(2).getMaxSensorRange())
                &&sensors.get(0).isActive()&&sensors.get(2).isActive()){
            abnormal=true;
            abnormalMessage= " Abnnormal Humidity ";
        }
        else if((luminous>sensors.get(1).getMaxSensorRange() || radiometry>sensors.get(1).getMaxSensorRange()) && sensors.get(1).isActive()){
            abnormal=true;
            abnormalMessage= " Abnnormal Light ";
        }
        else if((temp<sensors.get(0).getMinSensorRange() &&sensors.get(0).isActive()) || ((luminous<sensors.get(1).getMinSensorRange() || radiometry<sensors.get(1).getMinSensorRange())&& sensors.get(1).isActive())
                || ( (absHumidity>sensors.get(2).getMaxSensorRange() || relHumidity>sensors.get(2).getMaxSensorRange())&& sensors.get(2).isActive())
                    ){
            abnormal=true;
            abnormalMessage= " Abnnormal Case ";
        }
        
    } 
    
}
