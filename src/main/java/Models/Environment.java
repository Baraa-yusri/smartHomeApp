/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author baraa
 */
public final class Environment implements Serializable  {
    //Change the naming
    private static final long SerialVersionUID = 10l;
    private   int environmentId;
    private int numLocations; // Remove
    private  ArrayList <Location> locations;
    

    private Environment() {
        environmentId = 1;
        locations= new ArrayList <Location>();
        numLocations=locations.size();
    }

    private static Environment env=null;
    
    public static Environment getInstance(){
        if(env==null){
            env = new Environment();
            System.out.println("Instance is created");
        }
        return env;
    }

    private  Environment(int environmentID, ArrayList<Location> locations) {
        this.environmentId = environmentID;
        this.numLocations = locations.size();
        this.locations = locations;
    }
        
    public int getEnvironmentId() {
        return environmentId;
    }

    public int getNumLocations() {
        return numLocations;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setEnvironmentId(int environmentId) {
        this.environmentId = environmentId;
    }

    public void setNumLocations(int numLocations) {
        this.numLocations = numLocations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
    
   
    

}
