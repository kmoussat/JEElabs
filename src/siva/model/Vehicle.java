package siva.model;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ken
 */
public class Vehicle {
    private final String plate;
    private final String manufacturer;
    private String color;
    private final String model;
    private int id;
    private static int counter = 0;
    
    public Vehicle(String plate, String manufacturer, String model, String color, int id){
        this.plate = plate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.id = counter;
        //not thread safe
        
        
        counter += 1;
        
    }
    
    
    
    public String getPlate(){
        return plate;    
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
            
    public String getColor(){
        return color;
    }
    
    public String setColor(String col){
        color = col;
        return color;
    }
            
    
    public String getModel(){
        return model;
    }
    

    /**
     *
     * @return
     */
    @Override
    public String toString(){
    return "Manufacturer = " + manufacturer +
            " Model = " + model +
            " Plate = " + plate +
            " Color = " + color ;
} 

   /*
    //mapping the memory address to an integer value
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.plate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.plate, other.plate)) {
            return false;
        }
        return true;
    }
    */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
