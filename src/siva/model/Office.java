/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siva.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ken
 */

/*
list
array
dictionnary 

all possible
*/
public class Office {
    
    private String address;
    private List<Vehicle> vehicles;
    private final int capacity;

    public Office(String address, List<Vehicle> vehicles, int capacity) {
        this.address = address;
        vehicles = new ArrayList<Vehicle>();
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public boolean assign(Vehicle vehicle){
        if (vehicles.size() >= capacity){
            return false;
        }
        vehicles.add(vehicle);
        return true;
    }
  
       public boolean withdraw(Vehicle vehicle){
       return vehicles.remove(vehicle);       
    }
  
          public boolean check(Vehicle vehicle){
              
    return true;
    }
  
    
    
}
