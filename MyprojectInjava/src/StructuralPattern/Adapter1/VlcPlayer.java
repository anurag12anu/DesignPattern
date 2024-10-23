package StructuralPattern.Adapter1;


// Implements AdvanceMediaplayer

public class VlcPlayer implements AdvanceMediaPlayer {
    public void playVic(String fileName){
        System.out.println("Playing vlc file. Name : "+fileName);

    }
    public void playMp4(String fileName){
        System.out.println("Playing mp4 file Name : "+fileName);
    }
    
}


 class MpPlayer implements AdvanceMediaPlayer{
    public void playMp4(String fileName){
        System.out.println("Playing mp4 file Name : "+fileName);
    }
    public void playVic(String fileName){
        System.out.println("Playing vlc file. Name : "+fileName);

    }
    

}
