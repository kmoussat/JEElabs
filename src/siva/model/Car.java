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
public class Car extends Vehicle{
    private int seat;
    private String option;
    
    public Car(String plate, String manufacturer, String model, String color, int id, int seat, String option){
        super(plate,manufacturer,model,color,id);
        this.seat = seat;
        this.option = option;
 
    }
    
    public int getSeat(){
        return seat;
    }
    
    public void setSeat(int value){
        seat = value;
    }
    
    public String getOption()
    {
        return option;
    }
    
    public void setOption(String opt){
        option = opt;
    }
    
    @Override
       public String toString(){
    return super.toString() +
            " Seat(s) = " + seat +
            " Option(s) = " + option ;
} 
       
}
