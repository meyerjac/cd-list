import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class ArtistTest {

  @Test
  public void Artist_instantiatesNewArtist_true() {
    Artist artistData = new Artist("Megadeth");
    assertTrue(artistData instanceof Artist);
  }

  @Test
  public void Artist_getName() {
    Artist artistData = new Artist("Megadeth");
    assertEquals("Megadeth", artistData.getName());
  }

  @Test
  public void clear_emptiesAllArtistsFromList_0() {
    Artist artistData = new Artist("Megadeth");
    Artist.clear();
    assertEquals(Artist.all().size(), 0);
  }

  @Test
  public void getId_ArtistsInstantiateWithAnId_1() {
    Artist.clear();
    Artist artistData = new Artist("Megadeth");
    assertEquals(1, artistData.getId());
  }

  @Test
  public void find_returnsArtistWithSameId_secondCategory() {
    Artist.clear();
    Artist firstArtist = new Artist("usher");
    Artist secondArtist = new Artist("Rushe");
    assertEquals(Artist.find(secondArtist.getId()), secondArtist);
  }

  @Test
  public void getCDs_initiallyReturnsEmptyList_ArrayList() {
    Artist.clear();
    Artist testArtist = new Artist("ACDC");
    assertEquals(0, testArtist.getCDs().size());
  }

  @Test
  public void addCD_addsCDsToList_true() {
    Artist testArtist = new Artist("Led Zepplin");
    CD testCD = new CD("stairway");
    testArtist.addCD(testCD);
    assertTrue(testArtist.getCDs().contains(testCD));
  }
}
