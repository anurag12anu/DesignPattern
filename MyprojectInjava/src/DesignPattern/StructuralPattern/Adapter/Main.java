package StructuralPattern.Adapter;

import StructuralPattern.Adapter1.AudioPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "Vedio.mp3");
        audioPlayer.play("vlc", "movi.vlc");
        audioPlayer.play("avi", "movie.avi");
    }
    
}
