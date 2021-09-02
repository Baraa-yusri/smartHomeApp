
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
public class HumiditySensor extends Sensor{
    private float absoluteHumidity;
    private float relativeHumidity;

    public HumiditySensor() {
        super();
        sensorID=3;
        absoluteHumidity=10;
        relativeHumidity=5;
    }

    public HumiditySensor(float absoluteHumidity, float relativeHumidity, int sensorID, boolean active, float minSensorRange, float maxSensorRange, int updateTime) {
        super(sensorID, active, minSensorRange, maxSensorRange, updateTime);
        this.absoluteHumidity = absoluteHumidity;
        this.relativeHumidity = relativeHumidity;
    }

    public void setAbsoluteHumidity(float absoluteHumidity) {
        this.absoluteHumidity = absoluteHumidity;
    }

    public void setRelativeHumidity(float relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }

    public float getAbsoluteHumidity() {
        return absoluteHumidity;
    }

    public float getRelativeHumidity() {
        return relativeHumidity;
    }

    public int getSensorID() {
        return sensorID;
    }
    
     public float[] sensorData(){
        float[] data = new float[2];
        data[0]=absoluteHumidity;
        data[1]=relativeHumidity;
        return data;
    }
    
   
    
    
    
}
