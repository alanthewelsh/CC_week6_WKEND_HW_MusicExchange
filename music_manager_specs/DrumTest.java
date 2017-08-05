import static org.junit.Assert.*;
import org.junit.*;
import music_manager.*;

public class DrumTest {

  Drum drum;

  @Before
  public void before(){
    drum = new Drum("Bang", true);
  }

  @Test
  public void hasBassDrum(){
    assertEquals(true, drum.containsBassDrum());
  }

  // @Test
  // public void canMakeSound(){
  //   assertEquals("Bang", drum.playable());
  // }


}