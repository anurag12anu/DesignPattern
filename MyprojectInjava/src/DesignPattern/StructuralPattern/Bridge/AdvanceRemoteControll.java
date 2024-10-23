package StructuralPattern.Bridge;

public class AdvanceRemoteControll extends RemoteControll {
    public AdvanceRemoteControll(Device device){
        super(device);
    }
    public void mute(){
        device.setVolume(0);
    }
}
