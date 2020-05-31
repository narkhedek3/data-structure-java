package sorting_algorithms.src;

public class MergeSort extends Sort {

  @Override 
  public int[] sort(int[] arr) {

    mergeSort(arr, 0, arr.length);

    return arr;
  }
 
  
  public void mergeSort(int[] input, int start, int end) {
    
    if( (end - start) < 2 ) {
      return;
    }

    int mid = (start + end ) / 2;

    mergeSort(input, start, mid);
    mergeSort(input, mid, end);
    merge(input, start, mid, end);
  }

  public void merge(int[] input, int start, int mid, int end) {

    if(input[mid-1] <= input[mid]) {
      return;
    }

    int i = start;
    int j = mid;
    int tempIndex = 0;

    int[] temp = new int[end-start];


    while(i < mid && j < end) {
      temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
    }

    System.arraycopy(input, i, input, start + tempIndex , mid-i);
    System.arraycopy(temp, 0, input, start, tempIndex);

  }

}