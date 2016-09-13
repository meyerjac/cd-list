import java.util.Comparator;
public class CD {
  private String mName;

  public CD(String name) {
    mName = name;
  }

  public String getName() {
    return mName;
  }

   public static Comparator<CD> cdSort = new Comparator<CD>() {

     public int compare(CD c1, CD c2) {

        String CdName1 = c1.getName();
        String CdName2 = c2.getName();

        return CdName1.compareToIgnoreCase(CdName2);
      }
    };
}
