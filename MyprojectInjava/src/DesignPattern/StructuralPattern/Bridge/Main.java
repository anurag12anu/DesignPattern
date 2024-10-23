package StructuralPattern.Bridge;

public class Main {
    public static void main(String args[]){
        Device tv= new TV();
        Device radio=new Radio();

        RemoteControll basicRemoteforTV=new RemoteControll(tv);
        AdvanceRemoteControll advanceRemoteForRadio=new AdvanceRemoteControll(radio);
        System.out.println(tv.getStatus());
        basicRemoteforTV.togglePower();
        basicRemoteforTV.volumeUp();
        System.out.println(tv.getStatus());

        System.out.println("\n"+radio.getStatus());
        advanceRemoteForRadio.togglePower();
        advanceRemoteForRadio.mute();
        System.out.println(radio.getStatus());
        
        
    }
    
}
