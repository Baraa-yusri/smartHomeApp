/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author baraa
 */
public class LightSensor extends Sensor{
    private float radiometry;
    private float luminous;

    public LightSensor() {
        super();
        sensorID=1;
        radiometry = 1;
        luminous = 2;
    }

   

    
    public LightSensor(float radiometry, float luminous, int sensorID, boolean active, float minSensorRange, float maxSensorRange, int updateTime) {
        super(sensorID, active, minSensorRange, maxSensorRange, updateTime);
        this.radiometry = radiometry;
        this.luminous = luminous;
    }

    public float getRadiometry() {
        return radiometry;
    }

    public float getLuminous() {
        return luminous;
    }

    public void setRadiometry(float radiometry) {
        this.radiometry = radiometry;
    }

    public void setLuminous(float luminous) {
        this.luminous = luminous;
    }
     public int getSensorID() {
        return sensorID;
    }
    
   
    public float[] sensorData(){
        float[] data = new float[2];
        data[0]=luminous;
        data[1]= radiometry;
        return data;
    }
    
    
}
