package sorting_algorithms.src;

public class SelectionSort extends Sort {
  

  @Override 
  public int[] sort(int[] arr) {
    
    for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
      int largest = 0;
      for(int i = 0; i < lastUnsortedIndex; i++) {
        if(arr[largest] < arr[i]) {
          largest = i;
        }
      }
      swap(arr, largest, lastUnsortedIndex);
    }

    return arr;
  }

}