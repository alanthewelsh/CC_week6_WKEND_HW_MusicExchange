package music_manager;
import behaviours.*;

public class Drum extends Instrument implements Playable {

  private boolean containsBassDrum;

  public Drum(String playSound, boolean containsBassDrum){
    super(playSound);
    this.containsBassDrum = containsBassDrum;
  }

  public String playSound(String sound){
    return "Bang!";
  }

  public boolean containsBassDrum(){
    return this.containsBassDrum;
  }



}