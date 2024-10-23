package StructuralPattern.Bridge;

public class RemoteControll {
    protected Device device;
    public RemoteControll(Device device){
        this.device=device;
    }
    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
            
        }
    }
    public void volumeDouwn(){
        device.setVolume(device.getVolume()-10);
    }
    public void volumeUp(){
        device.setVolume(device.getVolume()+10);
    }
    
}
