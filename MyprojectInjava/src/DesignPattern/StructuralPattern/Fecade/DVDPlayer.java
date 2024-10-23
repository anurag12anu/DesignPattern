package StructuralPattern.Fecade;
//subSystem 1
public class DVDPlayer {
    public void on(){
        System.out.println("DVD Player is ON");
    }
    public void play(String movie){
        System.out.println("playing movie: "+movie);
    }
    public void off(){
        System.out.println("DVD Player is Off");
    }
    
}
//subSystem 2
class Projector{
    public void on(){
        System.out.println("Projector is ON");
    }
    public void wideScreenMode(){
        System.out.println("Project is wideScreenMode");
    }
    public void off(){
        System.out.println("Projector is OFF");
    }
}
//subStystem 3
class SoundSystem{
    public void on(){
        System.out.println("soundSystem is ON");
    }
    public void setVolume(int level){
        System.out.println("Sitting volume to : "+level);
    }
    public void off(){
        System.out.println("soundSystem is OFF");
    }
}

