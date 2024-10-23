package StructuralPattern.Fecade;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer=new DVDPlayer();
        Projector projector=new Projector();
        SoundSystem soundSystem=new SoundSystem();
        //create facade and use it
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(dvdPlayer, projector, soundSystem);
        homeTheaterFacade.watchMovie("Inception");
        homeTheaterFacade.endMovie();
    }
    
}
