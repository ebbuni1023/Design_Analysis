//import java.util.*;
public class FindIndex {
// we're goiing to consider the best, worst, and average case untimes for 2 algorithms solving the following problem:

// Input: array of integers arr, integer target x
// Output: Index of x withing arr if it is in arr, -1 other wise 

/* Examples: 
* findIndex({9, 70, -2, 4, 5, 11}, 4) -> 3
* Pseudocode:
* for each index i and corresponding element e in arr
* if e = x
*   return i
* return -1
*/

/* 
What's the best case runtime? O(1)
what's the worst case? O(N)
Average case? O(N)
What's the BEST type of input that would cause this algorithm to take the LEAST amound of steps? => when target x = arr[0]
What's the WORST type of input that would cause this algorithm to take the LEAST amound of steps? => when target x = arr[0]
=> if the target is at the end of the array, or if it's not in the array at all, then we'll have to go through every single element 
of the array
What's the TYPICAL type of input and the # of steps the algorithm will take to handle it?

*/

/* algorithm anotherFindIndex
Input: array of integers arr, integer target x
output: index of x withing arr if it is in arr, -1 otherwise
result = -1
for each index i and coressponding element e in arr
if e = x 
result = i 
return result

What's the best case runtime? O(N)
What's the worst case? O(N)
Average case? O(N)
*/ 

// What input will cause findIndex and anotherFindIndex to output different answers?

//How could we make this algorithm return the same output as the previous, without changing the runtimes? <- can be on quiz or test
    public static void main (String [] args){
       int[] arr = {9, 70, -2, 4, 5, 11};
       System.out.println(findIndex(arr, 4));
       //int [] testResult4 = findIndex(new int[] {1, 2, 3, 4, 5}, 10);
       //System.out.println(testResult4);
    }
    public static int findIndex(int[] arr, int x){

        for (int i = 0; i <arr.length; i++){
        if (x == arr[i])
            return i;
    }
        return -1;
    }
}
