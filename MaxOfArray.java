import java.util.*;

public class MaxOfArray{
    public static void main(String [] args){
        int testResult1 = maxOfArray(new int[] {1, 3, 4, 5, 2});
        int testResult2 = maxOfArray(new int[] {-1, -3, -4, -5, -2});

        System.out.println(testResult1); // should output 5
        System.out.println(testResult2); // should output -1
        boolean emptyCaseCorrect = false;
        try {
          maxOfArray(new int[] {});
        } catch (IllegalArgumentException e) {
        emptyCaseCorrect = true;
        }
        if (emptyCaseCorrect) {
        System.out.println("maxOfArray appears to work for the empty array case");
        } else {
        System.out.println("maxOfArray appears to be incorrect for the empty array case");
        }
    }
    public static int maxOfArray(int [] arr){
        if(arr.length==0) throw new IllegalArgumentException();
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(max < arr[i]) 
            max = arr[i];
        }
        return max;
    }
}