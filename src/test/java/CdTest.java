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
  @Test
  public void all_returnsAllInstancesOfCD_true() {
    CD firstCD = new CD("sky is the limit");
    CD secondCD = new CD("yellowtown");
    assertEquals(true, CD.all().contains(firstCD));
    assertEquals(true, CD.all().contains(secondCD));
  }

  @Test
  public void clear_emptiesAllCDFromArrayList_0() {
    CD myCD = new CD("sky is the limit");
    CD.clear();
    assertEquals(CD.all().size(), 0);
  }

  @Test
  public void getId_CDInstantiateWithAnID_1() {
    CD.clear();  // Remember, the test will fail without this line! We need to empty leftover Tasks from previous tests!
    CD myCD = new CD("sky is the limit");
    assertEquals(1, myCD.getId());
  }

  public void find_returnsCDWithSameId_secondTask() {
    CD firstCD = new CD("sky is the limit");
    CD secondCD = new CD("yellowtown");
    assertEquals(CD.find(secondCD.getId()), secondCD);
   }
}
