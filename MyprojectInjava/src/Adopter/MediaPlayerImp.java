package Adopter;

public class MediaPlayerImp implements MediaPlayer {
    MediaPlayerAdpter mediaPlayerAdpter;
    MediaPlayer mediaPlayer;


    @Override
    public void play(String fileToPlay, String formatToPlay) {
        if(formatToPlay.equals("mp3")){
            mediaPlayer=new DefaultMediaPlayer();
           mediaPlayer.play(fileToPlay, formatToPlay);
        }
        else{
            AdvanceFormate advanceFormate=new AdvanceFormate();
            advanceFormate.setResolution("720p");

            mediaPlayerAdpter=new MediaPlayerAdpter(advanceFormate);
            mediaPlayerAdpter.play(fileToPlay, formatToPlay);


        }
        
    }

    
}
