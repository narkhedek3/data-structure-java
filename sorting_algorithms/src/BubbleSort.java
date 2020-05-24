package sorting_algorithms.src;

public class BubbleSort extends Sort {
  
  @Override
  public int[] sort(int[] arr) {

    // After every iteration max value from partition is placed at correct position 
    for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ) {
      // bubbling out max value to last of partition 
      for(int i = 0; i < lastUnsortedIndex; i++) {
        if(arr[i] > arr[i + 1]) {
            swap(arr, i, i + 1);
        } 
      }
    }

    return arr;
  }

}