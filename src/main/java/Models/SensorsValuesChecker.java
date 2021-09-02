/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.TimerTask;

/**
 *
 * @author baraa
 */
public class SensorsValuesChecker extends TimerTask{
    Environment env;
    public SensorsValuesChecker(){
        env = Environment.getInstance();
    }
    
    @Override
    public void run(){
        for(int i=0; i<env.getLocations().size();i++){

        env.getLocations().get(i).checkSensorsValues();
            if(!env.getLocations().get(i).isAbnormal()){
                env.getLocations().get(i).setAbnormal(false);
                env.getLocations().get(i).setAbnormalMessage("");                
            }
            
        }
    }
    
}
