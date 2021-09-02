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
/*
-s_id: int
-active:bool
-sensor_Range:float
-update_time:float
*/

public abstract class Sensor implements Serializable{
    protected  int sensorID;
    private boolean active;
    private float maxSensorRange;
    private float minSensorRange;
    private int updateTime;

    public Sensor() {
        active = true;
        maxSensorRange = 10;
        minSensorRange = 1;
        updateTime = 1;
        
    }

    public Sensor(int sensorID, boolean active, float minSensorRange, float maxSensorRange, int updateTime) {
        this.sensorID = sensorID;
        this.active = active;
        this.maxSensorRange = maxSensorRange;
        this.minSensorRange = minSensorRange;
        this.updateTime = updateTime;
    }

    public int getSensorID() {
        return sensorID;
    }

    public boolean isActive() {
        return active;
    }

    public float getMaxSensorRange() {
        return maxSensorRange;
    }

    public float getMinSensorRange() {
        return minSensorRange;
    }

    public int getUpdateTime() {
        return updateTime;
    }

    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMaxSensorRange(float maxSensorRange) {
        this.maxSensorRange = maxSensorRange;
    }

    public void setMinSensorRange(float minSensorRange) {
        this.minSensorRange = minSensorRange;
    }

    public void setUpdateTime(int updateTime) {
        this.updateTime = updateTime;
    }
    
    
    public abstract float[] sensorData();
    
    
}
