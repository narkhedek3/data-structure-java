package sorting_algorithms.src;

public class Main {
  
  public static void main(String[] args) {

    BubbleSort b = new BubbleSort();

    int[] array = {10, 34, -56, 45, 23, 12, -34, 56, 34, 25};

    int[] sortedArray =  b.sort(array.clone()); // to keep actual copy of array..!

    for(int i = 0 ; i < array.length; i++) {
      System.out.println(sortedArray[i]);
      System.out.println(array[i]);
    }

  }

}