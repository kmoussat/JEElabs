package siva.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ken
 */
public class Utility extends Vehicle{
    private final int capacity;
    
    
       public Utility(String plate, String manufacturer, String model, String color, int id, int capacity){
        super(plate,manufacturer,model,color, id);
        this.capacity = capacity;  
    }
       
     public int getCapacity(){
        return capacity;
    }
    
     /*
    public void setCapacity(int value){
        capacity = value;
      
    }*/
     
        @Override
       public String toString(){
    return super.toString() +
            " Capacity = " + capacity ;
          
} 
}
