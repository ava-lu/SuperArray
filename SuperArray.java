public class SuperArray {
  //instance variables
  private String[] data;
  private int size; //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String old = data[index];
    data[index] = element;
    return old;
  }

  private void resize() {
    String[] bigdata = new String[20];
    for (int i=0; i<data.length; i++) {
      bigdata[i] = data[i];
    }
    data = bigdata;
  }
}
