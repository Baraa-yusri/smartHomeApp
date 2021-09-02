/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.Random;
import java.util.TimerTask;


public class DataReader extends TimerTask{
   
   Environment env; 
   static int counter;
   
   
   public DataReader(){
       env =Environment.getInstance();
   }          
        
  @Override
  public void run() {
     Random rand = new Random(); 
     counter++;
     System.out.println(counter);
      for(int i=0;i<env.getLocations().size();i++){
            
            TempSensor tempSensor =(TempSensor)env.getLocations().get(i).getSensors().get(0);
            LightSensor lightSensor=(LightSensor)env.getLocations().get(i).getSensors().get(1); 
            HumiditySensor humiditySensor =(HumiditySensor)env.getLocations().get(i).getSensors().get(2);
                    
            if(counter%env.getLocations().get(i).getSensors().get(0).getUpdateTime()==0){
                tempSensor.setTemp((float)Math.floor(Math.random()*(50-0+1)+0));
            }
            if(counter%env.getLocations().get(i).getSensors().get(1).getUpdateTime()==0){
                lightSensor.setLuminous((float)Math.floor(Math.random()*(50-0+1)+0));
                lightSensor.setRadiometry((float)Math.floor(Math.random()*(50-0+1)+0));
            }
            if(counter%env.getLocations().get(i).getSensors().get(2).getUpdateTime()==0){
                humiditySensor.setAbsoluteHumidity((float)Math.floor(Math.random()*(50-0+1)+0));
                humiditySensor.setRelativeHumidity((float)Math.floor(Math.random()*(50-0+1)+0));
            }
            
            System.out.println("LocationID:"+(Integer.toUnsignedString(env.getLocations().get(i).getLocationId())));
            System.out.println("Light Luminous:"+ env.getLocations().get(i).getSensors().get(1).sensorData()[0]+" Light Radiometry: "+ env.getLocations().get(i).getSensors().get(1).sensorData()[1]+" Min:"+env.getLocations().get(i).getSensors().get(1).getMinSensorRange()+"Max:"+env.getLocations().get(i).getSensors().get(1).getMaxSensorRange());
            System.out.println("Tempreture:"+ env.getLocations().get(i).getSensors().get(0).sensorData()[0]+" Min:"+env.getLocations().get(i).getSensors().get(0).getMinSensorRange()+" Max:"+env.getLocations().get(i).getSensors().get(0).getMaxSensorRange());
            System.out.println("Abs Humidiy :"+ env.getLocations().get(i).getSensors().get(2).sensorData()[0]+" Rel. Humidity:"+ env.getLocations().get(i).getSensors().get(2).sensorData()[1]+" Min:"+env.getLocations().get(i).getSensors().get(2).getMinSensorRange()+"Max:"+env.getLocations().get(i).getSensors().get(2).getMaxSensorRange());

            
            // check sensors returns string or two threads solution
           if((env.getLocations().get(i).isAbnormal())){
               System.out.println("");
               System.out.println(env.getLocations().get(i).getAbnormalMessage());
               System.out.println("");
           }
            
      }
      

      
   }
    
   
    
}
