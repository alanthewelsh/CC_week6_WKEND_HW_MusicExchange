import static org.junit.Assert.*;
import org.junit.*;
import music_manager.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before(){
    piano = new Piano("Wood", "Grand");
  }

  @Test
  public void hasType(){
    assertEquals("Grand", piano.pianoType());
  }

  @Test
  piblic void hasMaterial(){
    assertEquals("Wood", piano.material());
  }

}