package sorting_algorithms.src;

public class InsertionSort extends Sort {
 
  @Override 
  public int[] sort(int[] arr) {

    for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
      
      int newElememt = arr[firstUnsortedIndex];

      int i;

      for(i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElememt; i--) {
        arr[i] = arr[i - 1];
      }

      arr[i] = newElememt;

    }

    return arr;

  }

}