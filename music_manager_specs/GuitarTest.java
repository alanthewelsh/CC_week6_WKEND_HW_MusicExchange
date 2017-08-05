import static org.junit.Assert.*;
import org.junit.*;
import music_manager.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before(){
    guitar = new Guitar("Strum!", 6);
  }

  @Test
  public void hasStrings(){
    assertEquals(6, guitar.numberOfStrings());
  }

}