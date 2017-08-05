package music_manager;
import behaviours.*;

public class Piano extends Instrument implements Playable{

  private String pianoType;

  public Piano(String instrumentMaterial, String pianoType){
    super(instrumentMaterial);
    this.pianoType = pianoType;
  }

  public String pianoType(){
    return this.pianoType;
  }

  public String playSound(String sound){
    return sound + " played on " + this.instrumentMaterial + " " + this.pianoType;
  }

}