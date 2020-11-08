public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i=0; i<s.size(); i++) {
      String str = s.get(i);
      for (int j=s.size()-1; j>=0; j--) {
        if (i != j && s.get(j).equals(str)) s.remove(j);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray c = new SuperArray();
    for (int i=0; i<a.size(); i++) {
      String str = a.get(i);
      if (b.contains(str)) c.add(str);
    }
    removeDuplicates(c);
    return c;
  }

  public static void main(String[] args) {
    //removeDuplicates test
    // SuperArray words = new SuperArray();
    // words.add("kani"); words.add("uni");
    // words.add("ebi"); words.add("una");
    // words.add("una"); words.add("ebi");
    // words.add("kani"); words.add("una");
    // words.add("una"); words.add("ebi");
    // words.add("toro");
    // System.out.println(words);
    // removeDuplicates(words);
    // System.out.println(words);

    //findOverlap test
    SuperArray a = new SuperArray(6);
    a.add("9"); a.add("1"); a.add("2");
    a.add("2"); a.add("3"); a.add("4");
    SuperArray b = new SuperArray(5);
    b.add("0"); b.add("4"); b.add("2");
    b.add("2"); b.add("9");
    System.out.println(findOverlap(a, b));

  }






}
