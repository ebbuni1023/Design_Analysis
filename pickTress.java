public class pickTress {
    public static void main(String [] args){
        int testResult5 = pickTrees(new int[] {1, 2, 3, 4, 5});
        System.out.println(testResult5); // should output 9
    
        int testResult6 = pickTrees(new int[] {1, 3, 4, 3});
        System.out.println(testResult6); // should output 6
    
        int testResult7 = pickTrees(new int[] {5, 1, 4, 9});
        System.out.println(testResult7); // should output 14 
    }

    public static int findMaxTree(int[] trees, int i, int n, int p)
    {
        // i is the current element's index and
        // p is previous element's index 
        // base condition
        if(i == n) {
            return 0;
        }
 
        // Exclude the current element and make a recursive call to recur 
        int temp1 = findMaxTree(trees, i+1, n, p);
        
        // set temp2 to 0
        int temp2 = 0;
 
        // Now, if the current element is not neighbour of previous element, include it
        if(i != (p+1)){
            temp2 = findMaxTree(trees, i+1, n, i) + trees[i];
        }
 
        // finally, return the maximum sum with or without the current element
        return Integer.max(temp1, temp2);
    }
    
    // this function calls findMaxWood() function to find the maximum amount
    // of wood that can be harvested from the provided array of trees
    public static int pickTrees(int []arr)
    {
        // find array size
        int n = arr.length;
        
        // make a function call
        int maxWood = findMaxTree(arr, 0, n, -2);
        
        // return the result to the main
        return maxWood;
    }
}
