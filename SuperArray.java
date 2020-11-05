public class SuperArray {
  //instance variables
  private String[] data;
  private int size; //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size==data.length) resize();
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
    String[] bigdata = new String[size*2];
    for (int i=0; i<data.length; i++) {
      bigdata[i] = data[i];
    }
    data = bigdata;
  }

  public boolean isEmpty() {
    return(size==0);
  }

  public void clear() {
    size = 0;
    for (int i=0; i<data.length; i++) {
      data[i] = null;
    }
  }

   public String toString() {
     String array = "[";
     if (size == 0) array = "[]";
     for (int i=0; i<size; i++) {
       if (i == size - 1) {
         array+=String.valueOf(data[i])+"]";
       }
       else array+=String.valueOf(data[i])+", ";
     }
     return array;
   }

  public boolean contains(String s) {
    boolean a = false;
    for (int i=0; i<data.length; i++) {
      if (data[i].equals(s)) a = true;
    }
    return a;
  }

  public void add(int index, String element) {
    if (size == data.length) resize();
    for (int i=size-1; i>=index; i--) {
      String store = data[i];
      data[i+1] = store;
    }
    data[index] = element;
    size++;
  }

  // public String remove(int index) {
  //   String value = data[index];
  //
  // }

}
