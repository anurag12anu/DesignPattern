package Adopter;

public class DefaultMediaPlayer implements MediaPlayer {

    public void play(String fileToPlay,String formatToPlay){

        System.out.println("playing : " +fileToPlay+" . "+formatToPlay);
    }
    
}
