package music_manager;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable{

  private int numberOfStrings;

  public Guitar(String instrumentMaterial, int numberOfStrings){
    super(instrumentMaterial);
    this.numberOfStrings = numberOfStrings;
  }

  public String playSound(String sound){
    return "Strum!";
  }

  public int numberOfStrings(){
    return this.numberOfStrings;
  }

  public int salePrice(int distance) {
    return purchasePrice + this.markUp;
  }

}