package ModelsUnitTest;

import Models.HumiditySensor;
import Models.LightSensor;
import Models.Location;
import Models.Sensor;
import Models.TempSensor;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baraa
 */
public class ChekSensorsValueTest7 {
    private int locationID;
    private String abnormalMessage;
    private boolean abnormal;
    ArrayList<Sensor> sensors;
    
    public ChekSensorsValueTest7() {
        locationID=0;
        abnormalMessage="";
        abnormal = false;
        sensors = new ArrayList<Sensor>();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }



    /**
     * Test of checkSensorsValues method, of class Location.
     */
    
    /*test suits
    min=20,max=25  min=20,max=25  min=20,max=25
        temp            luminous  radiometry         abs.Humidity   rel.humdity
        22              22             22                -               -                  abnormal tempreture
        22              -               -                20              24                 abnormal humidity   
        -               23             10                -                -                 abnormal light
        10              -              -                 -                -                 abnormal case    
        -               10              -               -                 -                 abnormal case
        -               10              -               -                 -                 abnormal case
        -               -               10              -                 -                 abnormal case
        -               -               -               10                -                 abnormal case
        -               -               -               -                 10                abnormal case    
    */
    
    
    @Test
    public void testCheckSensorsValues() {
        System.out.println("checkSensorsValues");
        ArrayList<Sensor> sensors = new ArrayList<>();

       
       TempSensor tempSensor = new TempSensor(27,1,true,20,25,1);
       LightSensor lightSensor = new LightSensor(2,2,2,false,20,25,3);
       HumiditySensor humiditySensor = new HumiditySensor(27,22,3,true,20,25,1);
       sensors.add(tempSensor);
       sensors.add(lightSensor);
       sensors.add(humiditySensor);
       Location instance = new Location(sensors);
       instance.checkSensorsValues();
       String expResult = " Abnnormal Humidity ";
       assertEquals(expResult, instance.getAbnormalMessage());
       
    }
    
}
