/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siva.model;

import java.util.ArrayList;
import static java.util.Collections.synchronizedList;
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
   // private List<Vehicle> vehicles;
    private List<Vehicle> vehicles = synchronizedList(new ArrayList<Vehicle>());
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
    
    public synchronized boolean assign(Vehicle vehicle){
        if (vehicles.size() >= capacity){
            return false;
        }
        vehicles.add(vehicle);
        return true;
    }
  
       public synchronized boolean withdraw(Vehicle vehicle){
       return vehicles.remove(vehicle);       
    }
  
          public synchronized boolean check(Vehicle vehicle){
            
    return true;
    }
  
          
     public List<Vehicle> getbyMake(String manufacturer)
          {
              List<Vehicle> result = new ArrayList<Vehicle>();
              
              Vehicle[] copy;
              synchronized(this){
                  copy = vehicles.toArray(new Vehicle[0]);
              }
              for(Vehicle V: vehicles)
              {
                  if (V.getManufacturer().equals(manufacturer))
                  {
                      result.add(V);
                  }
              }
              return result;
          }     
    
    
}
