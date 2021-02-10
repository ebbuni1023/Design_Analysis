/**
 * An Odd ALgorithm // DONE
 * Quick Maths
 * Approaching the Counter
 * A Heaping of Operations
 * Ready for Radix
 * Mastering Theorems
 * Recuse Softly and Carry a Big Sum
 * Out on the Range
 */

 /**
  * (A) 
  An Odd Algorithm
  Convert the following Java code into Pseudocode:

  public static int findFirstOdd(List<Integer> lst) {
    for (int i = 0; i < lst.size(); i++) { // Let n = size of the list
      int el = lst.get(i);
      if (el % 2 == 1) {
        return i;
      }
    }
    return -1;
  }

  => 
  for index i in lst 
  el = lst [i]
  if el % 2 is odd
    return i
  return -1

  algorhthm findFirstOdd
  Input: list of integers in lst
  Output: returns the first odd number, -1 if no odd numbers exist in the list.

  *(B)
  What's the best case runtime of this algorithm? Be sure to define n and provide an example.
  - Let n is the size of the list. Best case runtime of thie algorithm is O(1) because we will iterate the for loop and
  will get the first odd number. Size of the list doesn't matter.
  For example: [1, 0, 0, 0, 0, 0, 0]

  *(C)
  What's the worst case runtime of this algorhtim? Be sure to define n and provide an example.
  - Let n be the dize of the list. The worst case is O(n), where no odd numbers exist in lst, and we return -1.
  We have to iterate every single element of the listm doing constant work each time, leading to n work over all iterations.
  For example: [0, 0, 0, 0, 0, 0]
  */

  /**
   * QuckMaths
   * (A) O(n log n) Quick Sort
   * Sort the following array via the in-place QuickSort algorithm we saw in homework 3. Show the state of the array every time
   * we perform a swap.
   * [1, 3, 4, 6, 8, 7, 2]
   * 
   * it will be not on test but will practice for future algorithm
   */

/**
 * Approaching the Counter
 * Given the following algorithm for CountingSort, find the runtime and space complexity
 * algorithm countingSort
  Input: array of integers arr with elements in the range of 0 to k inclusive
  Output: sorted array of integers
  
  counts = arr of size k+1
  for element el in lst
    counts[el] += 1
  
  result = array of zeros of size arr.length
  resultIndex = 0
  for index i in counts
    while counts[i] > 0
      result[resultIndex] = i
      resultIndex += 1
      counts[i] -=1
  return result

  * Runtime
  * Space complexity
 */

public class Exam1 {

}
