package sorting_algorithms.src;

public class ShellSort extends Sort {
  
  @Override
  public int[] sort(int [] arr) {

    // performing insertion sort with gap...
    for(int gap = arr.length/2 ; gap > 0; gap /= 2) 

      for(int i = 0; i < arr.length; i++) {
        
        int newElement = arr[i];

        int j = i;

        while(j  >= gap &&  arr[j - gap] > newElement) {
          arr[j] = arr[j - gap];
          j -= gap;
        }

        arr[j] = newElement;
        
      }

    return arr;
  }

}