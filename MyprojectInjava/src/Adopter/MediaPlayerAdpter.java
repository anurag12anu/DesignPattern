package Adopter;

public class MediaPlayerAdpter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;
    AdvanceFormate advanceFormate;

    public MediaPlayerAdpter(AdvanceFormate advanceFormate){
        advanceMediaPlayer=new AviPlayer();
        this.advanceFormate=advanceFormate;

    }
    public void play(String fileToPlay,String formatToPlay){
        advanceFormate.setFileToPlay(fileToPlay);
        advanceFormate.setFormatToPlay(formatToPlay);
        advanceMediaPlayer.playAdvanceFormate(advanceFormate);


    }
    
}
