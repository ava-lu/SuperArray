public class ErrorTester {
  public static void main(String[] args) {
    //catch exceptions
    try {
      SuperArray test1 = new SuperArray(-5);
    }
    catch (IllegalArgumentException e) {
      System.out.println("NEGATIVE CAPACITY??");
    }
  }
}
