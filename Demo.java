public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i=0; i<s.size(); i++) {
      String str = s.get(i);
      for (int j=s.size()-1; j>=0; j--) {
        if (i != j && s.get(j).equals(str)) {
          s.remove(j);
        }
      }
    }
  }
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("kani");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("toro");
    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }






}
