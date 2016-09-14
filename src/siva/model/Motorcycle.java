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
public class Motorcycle extends Vehicle{
    private int engine_size;
    
       public Motorcycle(String plate, String manufacturer, String model, String color, int id, int engine_size){
        super(plate,manufacturer,model,color, id);
        this.engine_size = engine_size;
       
 
    }
    
      public int getEngine_Size(){
        return engine_size;
    }
    
    public void setEngine_Size(int value){
        engine_size = value;
    }
    
       @Override
       public String toString(){
    return super.toString() +
            " Engine size = " + engine_size;
} 
       
}
