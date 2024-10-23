package StructuralPattern.Adapter;





// Adapter (Adapting advanceMediaplayer to Mediaplaer)


public class MediaAdapter implements MediaPlayer {

    MpPlayer advanceMusicPlayer;
    VlcPlayer advanceVedioPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceVedioPlayer=new VlcPlayer();

        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advanceMusicPlayer=new MpPlayer();
        }
    }

    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMusicPlayer.playVic(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advanceMusicPlayer.playMp4(fileName);
        }
    }
    
}
