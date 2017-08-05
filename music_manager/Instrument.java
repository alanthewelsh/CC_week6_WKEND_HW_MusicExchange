package music_manager;

public abstract class Instrument{

  protected String instrumentMaterial;

  public Instrument(String instrumentMaterial){
    this.instrumentMaterial = instrumentMaterial;
  }

  public String instrumentMaterial(){
      return this.instrumentMaterial;
  }
}