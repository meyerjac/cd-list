import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class CdTest {

  @Test
  public void Cd_instantiatesNewCd_true() {
    CD cdData = new CD("Megadeth: Rust in Peace");
    assertTrue(cdData instanceof CD);
  }

  @Test
  public void Cd_getName() {
    CD cdData = new CD("Megadeth: Rust in Peace");
    assertEquals("Megadeth: Rust in Peace", cdData.getName());
  }

  @Test
  public void Cd_sortedByName() {
    ArrayList<CD> newCD = new ArrayList<CD>();
    CD cdData = new CD("Megadeth: Rust in Peace");
    newCD.add(cdData);
    cdData = new CD("bob");
    newCD.add(cdData);
    Collections.sort(newCD, CD.cdSort);
  }
}
