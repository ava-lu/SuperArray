import java.util.Arrays;
public class ErrorTester {
  public static void main(String[] args) {
    //catch exceptions

    //SuperArray(int InitialCapacity)
    // try {
    //   SuperArray test1 = new SuperArray(-5);
    // }
    // catch (IllegalArgumentException e) {
    //   System.out.println("NEGATIVE CAPACITY??");
    // }

    //get() & set() & add() & remove()
    SuperArray test2 = new SuperArray(3);
    test2.add("a"); test2.add("b"); test2.add("c");
    try {
    //  System.out.println(test2.get(10));
    //  System.out.println(test2.set(-5, "yay"));
      test2.add(3, "yum");
    //  test2.remove(7);
    }
    catch (IndexOutOfBoundsException e){
      System.out.println("NOT IN BOUNDS!");
    }
    System.out.println(test2.toString());

  }
}
