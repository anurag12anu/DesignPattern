package Adopter;

public class AviPlayer implements AdvanceMediaPlayer{

    @Override
    public void playAdvanceFormate(AdvanceFormate advanceFormate) {
        System.out.println("Playing user Advance meadia play "+advanceFormate.getFileToPlay()+"."+advanceFormate.getFormatToPlay()+" in resolutin"+advanceFormate.getResoution());
        

    }
    
}
