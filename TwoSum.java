import java.util.*;
public class TwoSum{
    public static void main(String [] args){

        int [] testResult3 = twoSum(new int[] {0, 2, 3, 4, 5}, 6);
        int [] testResult4 = twoSum(new int[] {1, 2, 3, 4, 5}, 10);
        
        System.out.println(Arrays.toString(testResult3)); // should output [1, 3]
        System.out.println(Arrays.toString(testResult4)); // should output [-1,-1]

    }


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
}