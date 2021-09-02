/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author baraa
 */
public class TempSensor extends Sensor{
    private float temp;

    public TempSensor() {
        super();
        sensorID=2;
        temp=25;
    }

    public TempSensor(float temp, int sensorID, boolean active, float minSensorRange, float maxSensorRange, int updateTime) {
        super(sensorID, active, minSensorRange, maxSensorRange, updateTime);
        this.temp = temp;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    
      public int getSensorID() {
        return sensorID;
    }
    
      
    public float[] sensorData(){
        float[] data = new float[1];
        data[0]=temp;
        return data;
    }
    
    
    
}
