package arrays.src.main;

public class Test {
  public static void main(String[] args) {
    

    // Basic example of How to create array
    int[] intArray = new int[7];


    // How to assign value and retrive values from array..!
    for(int i = 0; i < intArray.length; i++) {
      intArray[i] = (i+1) * 10;
      System.out.println(intArray[i]);
    }

  }
}