
# Sorting Algorithms

# In place algorithm 

  Algorithm which doesn't required extra memory according to size of data structure.

# Bubble sort 

  time complexity O(n^2) quadratic

  In Bubble sort after every iteration on element from array gets correct position.
  
  And in every iteration n comparisions are done to decide correct position of element.
  
  Bubble sort is stable sort.

# stable and unstable sort

  This comes in picture when we have duplicate values in array.

  If array is having duplicate values and at the time of sorting relative order of duplicate values is changed then it is known as **unstable sort**. 

  It doesn't matter when we are sorting primitives.

  eg.
  ```
  original array => [{name:a, number:2}, {name:b, number:4}, {name:c, number:2}]

  unstable sort => [{name:c, number:2}, {name:a, number:2}, {name:b, number:4}]

  stable sort => [{name:a, number:2}, {name:c, number:2}, {name:b, number:4}]
  ```
# Selection sort

  time complexity O(n^2) quadratic

  In Selection sort after every iteration on element from array gets correct position.
  
  In every iteration only one comparision is done to decide correct position of element.

  In every iteration index of largest/smallest element is calculated and replaced with end/start of partition.
  
  Selection sort is unstable sort[relative order is not maintained].

# Insertion Sort

  time complexity O(n^2) quadratic.

# Shell Sort 

  It is optimization of insertion sort.

  time complexity O(n^2) quadratic. But in some cases it will work linearly.

  After every iteration partially sorted array is crated and normally half of the array length iterations are required to sort entire array.

# Recursion 

  Calling a function from it's own body again and again with some breaking condition[break case] is known as **Recursion**.

  eg. calculating factorial of number. 
  
  logic
  ```
  2! = 2 * 1! => factorial(2) = 2 * factorial(1) 
  3! = 3 * 2! => factorial(3) = 3 * factorial(2) 
  4! = 4 * 3! => factorial(4) = 4 * factorial(3) 
  ```
  pseudo code
  ```
  factorial(num) {
    // termination codition
    if(num <= 0) {
      return 1;
    }

    // recursion to get factorial
    return num * factorial(num -1 );
  }
  ```

# Merge Sort

  time complexity O(nlogn) - base 2

  Recursive sort.

  It consists of two steps : splitting and merging [Divide and Conquer].

  Splitting is logical [No new arrays are created].

  Merging is process of adding two logically splitted array values into new temporary array.

  Stable algorithm, Not an in-place algorithm.





