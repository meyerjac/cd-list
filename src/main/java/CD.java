import java.util.Comparator;
import java.util.ArrayList;

public class CD {
  private String mName;
  private static ArrayList<CD> instances = new ArrayList<CD>();
  private int mID;

  public CD(String name) {
    mName = name;
    instances.add(this);
    mID = instances.size();
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

  public static ArrayList<CD> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mID;
  }

  public static CD find(int id) {
    return instances.get(id - 1);
  }
}
