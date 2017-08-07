package music_manager;
import behaviours.*;

public class Piano extends Instrument implements Playable{

  private String pianoType;

  public Piano(String instrumentMaterial, String pianoType){
    this.material = super(instrumentMaterial);
    this.pianoType = pianoType;
  }

  public String pianoType(){
    return this.pianoType;
  }

  public String material(String sound){
    return this.material;
  }

}