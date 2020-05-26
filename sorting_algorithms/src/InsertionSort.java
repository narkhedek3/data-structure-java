package sorting_algorithms.src;

public class InsertionSort extends Sort {

  @Override
  public int[] sort(int[] arr) {

    // starting loop from second element because partition with single element is
    // always sorted
    for (int firstSortedIndex = 1; firstSortedIndex < arr.length; firstSortedIndex++) {

      // newElement is a value which will be
      // shifted to correct position in this iteration
      int newElement = arr[firstSortedIndex];

      int i;

      for (i = firstSortedIndex; i > 0; i--) {
        // shifting if greater than new Element in partition
        if (arr[i - 1] > newElement)
          arr[i] = arr[i - 1];
        else
          break;
      }

      arr[i] = newElement;

    }

    return arr;

  }

}