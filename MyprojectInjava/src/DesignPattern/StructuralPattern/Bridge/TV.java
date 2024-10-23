package StructuralPattern.Bridge;
//create concreate implements for various device


public class TV  implements Device{
    private boolean on=false;
    private int volume=30;
    //@override
    
    public boolean isEnabled(){
        return on;

    }
    //override
    public void enable(){
        on=true;
    }
    public void disable(){
        on=false;
    }
    //override
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume=volume;

    }
    //override
    public String getStatus(){
        return "TV is "+(on ? "ON":"OFF")+" with volume at : "+volume ;
    }
    
}
//Concreate implementer 2
 class Radio implements Device{
    private boolean on=false;
    private int volume=30;
    //@override
    
    public boolean isEnabled(){
        return on;

    }
    //override
    public void enable(){
        on=true;
    }
    public void disable(){
        on=false;
    }
    //override
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume=volume;

    }
    //override
    public String getStatus(){
        return "Radio is "+(on ? "ON":"OFF")+" with volume at : "+volume ;
    }
    
}

