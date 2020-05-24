
package sorting_algorithms.src;


public abstract class Sort {
  
  abstract int[] sort(int[] arr);
  
  public void swap(int[] arr, int i, int j) {
    
    if(i == j)
      return;
    
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }

}