package StructuralPattern.Fecade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector,SoundSystem soundSystem){
        this.dvdPlayer=dvdPlayer;
        this.projector=projector;
        this.soundSystem=soundSystem;

    }
    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.on();
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(10);
        dvdPlayer.play(movie);
    }
    public void endMovie(){
        System.out.println("Sutting douwn movie threater...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
    
}
