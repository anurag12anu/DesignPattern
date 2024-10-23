package Adopter;

public class MediaMain {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer=new MediaPlayerImp();
        mediaPlayer.play("mySong", "mp3");
        mediaPlayer.play("mySongInNewFormat", "avi");
    }
    
}
