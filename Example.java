import java.util.*;

public class Example {
    /**
     * Algorithm selectionSort
	    Input: list of integers lst of size N
	    Output: lst such that its elements are in sorted order

        for index i = 0, 1, 2, …, N -2
        min_index = i
        for j = N-1, N-2, .., i + 2, i + 1
            if lst[j] < lst[min_index]
                min_index = j
            temp = lst [i]
            lst[i] = lst [min_index]
            lst[min_index] = temp
     */

    public static void main(String [] args){
        List<Integer> lst = new ArrayList<Integer>(Arrays.asList(3,3,4,3));
        System.out.println(mystery(lst));
    }
     /**
      * algorithm mystery
            Input: List of integers lst of size N > 0
            Output: ???

            if N = 1
                return lst.get(0)
            else
                left = mystery(lst.subList(0, floor(N/2)))
                right = mystery(lst.subList(floor(N/2)), N)
                if left <= right
                    return left
                return right
      */
    // public static int mystery(List <Integer> lst){
    //     assert lst.size() > 0;
    //     int N = lst.size();

    //     if(N == 1){
    //         return lst.get(0);
    //     } else {
    //         int left = mystery(lst.subList(0, floor(N/2)));
    //         int right = mystery(lst.subList(floor(N/2),N));
    //     }
    //     if(left <= right){
    //         return left;
    //     }
    //     return right;
    // }
    public static int mystery(List<Integer> lst) {
        int n = lst.size();
        assert n > 0;
        if (n ==1) return lst.get(0);
        else {
          int left = mystery(lst.subList(0, floor(n/2)));
          int right = mystery(lst.subList(floor(n/2), n));
          if (left <= right ) {
            return left;
        }
        return right;
      }
    }

}
