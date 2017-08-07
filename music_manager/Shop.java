package music_manager;
import behaviours.*;

public abstract class Shop implements Sellable {

    protected int markUp;

    public Shop(int markUp) {
      this.markUp = markUp;
    }

    public int getMarkUp() {
      return this.markUp;
    }
  }

}