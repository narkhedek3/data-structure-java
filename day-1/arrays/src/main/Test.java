package arrays.src.main;

public class Test {
  public static void main(String[] args) {
    

    // Basic example of How to create array
    int[] intArray = new int[7];


    // How to assign value and retrive values from array..!
    for(int i = 0; i < intArray.length; i++) {
      intArray[i] = (i+1) * 10;
      // how to calculate address of i'th element
      // (x + i * y)
      // where,
      // x = start address of array
      // i = index
      // y = size of element of array
      System.out.println(intArray[i]);
    }

  }
}