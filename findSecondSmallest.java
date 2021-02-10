import java.util.ArrayList;
import java.util.List;

public class findSecondSmallest {
    /**
     * algorithm findSecondSmallest  
     *  input: list of Integers Lst,    
     *      where size of Lst > 1  
     *  output: the second smallest    
     *      element in Lst  
     * 
     *  firstSmallest = infinity  
     *  secondSmallest = infinity  
     *  for each element el in Lst,	
     *      if el < firstSmallest       
     *          secondSmallest = firstSmallest       
     *  firstSmallest = el	
     *      else if el < secondSmallest       
     *  secondSmallest = el  
     *      return secondSmallest
     */
    public static void main (String [] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
    }
    
	public static int findSecondSmallest1(List<Integer> list) {
         assert list.size() > 1; // list needs to have at least 2 elements
         int firstSmallest = Integer.MAX_VALUE;
         int secondSmallest = Integer.MAX_VALUE;
         for(int i = 0; i < list.size(); i++) {
             int el = list.get(i);
             if ( el < firstSmallest){
                 secondSmallest = firstSmallest;
                 firstSmallest = el;
             }else if (el < secondSmallest){
                 secondSmallest = el;
             }                 
             
         }
         return secondSmallest;
     }
}
