import java.util.*;
public class TwoSum{
    public static void main(String [] args){

        int [] testResult3 = twoSum(new int[] {0, 2, 3, 4, 5}, 6);
        int [] testResult4 = twoSum(new int[] {1, 2, 3, 4, 5}, 10);
        int [] testResult5 = twoSumFast(new int[] {1, 2, 3, 4, 5}, 10);

        System.out.println(Arrays.toString(testResult3)); // should output [1, 3]
        System.out.println(Arrays.toString(testResult4)); // should output [-1,-1]
        System.out.println(Arrays.toString(testResult5)); // should output [-1,-1]

    }
/**
 * What's the best case runtime ? O(1)
 * What's the worst case? O(N^2)
 * Average case? O(N^2)
 * How much space does it use?
 */

public static int[] twoSum(int[] arr, int targetSum){
    for (int i = 0; i < arr.length; i++){
        for(int j = i + 1; j < arr.length; j++){
            if(arr[i] + arr[j] == targetSum){
                return new int[]{i, j};
            }
        }
    }
    return new int[]{-1,-1};
    
}
//using HashSet
/**
 * What's the best case runtime? O(1)
 * What's the worst case?
 * Average case?
 * How much space does it use?
 */
public static int[] twoSumFast(int[] arr, int target){
    HashSet<Integer> seen = new HashSet<>();
    for (int j = 0; j < arr.length; j++){
        int otherAddend = target - arr[j];
        if(seen.contains(otherAddend)){
            for (int i = 0; i < arr.length; i++){
                if(arr[i] == otherAddend){
                    return new int[] {i, j};
                }
            }
        } else {
            seen.add(arr[j]);
        }
    }
    return new int[] {-1, -1};
}
}