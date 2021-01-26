import java.util.*;
public class Add {
    public static void main(String [] args){
    List<Integer> testResult5 = add(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 2));
    List<Integer> testResult6 = add(Arrays.asList(9, 9, 9), Arrays.asList(1));
    List<Integer> testResult7 = add(Arrays.asList(9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 7, 5, 8, 0, 7), Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(testResult5); // should output [3, 6, 5]
    System.out.println(testResult6); // should output [1, 0, 0, 0]
    System.out.println(testResult7); // should output [9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 8, 8, 1, 5, 2]
    }

    //public static List<Integer> add(List<Integer> lst1, List<Integer> lst2) {
      // 1. conver to integer
//        lst1.get(0) * 10^lst1.size() + lst1.get(1) * 10^(lst1.size()-1) + lst1.get(2) * 10^(lst1.size()-2)
//        lst1.get(0) * 10^lst1.size() + lst1.get(1) * 10^(lst1.size()-1) + lst1.get(2) * 10^(lst1.size()-2) + lst1.get(3) * 10^(lst1.size()-3)
      // 2. add two numbers
      // 3. making into arrays
//        int sum1 = 0;
//        for(int i=0; i < lst1.size() ; i++ ){
//            // conver to integers
////            System.out.println( lst1.get(i) );
//            sum1 = sum1 + lst1.get(i) * (int) Math.pow(10, (lst1.size() - i -1) );
//        }
//        System.out.println("sum " + sum1);

//        String sum = "";
//        for( int i =0 ; i < lst1.size()   ;  i++ ) {
//            sum = sum + lst1.get(i);
//        }
////        System.out.println("sum:" + sum);
//        String sum2 = "";
//        for( int i =0 ; i < lst2.size()   ;  i++ ) {
//            sum2 = sum2 + lst2.get(i);
//        }
////        System.out.println("sum2:" + sum2);
//        int sum3 = Integer.parseInt(sum) + Integer.parseInt(sum2);
////        System.out.println("sum3:" + sum3);
//        // change value to lists.
//        String strSum3 = String.valueOf(sum3);
//        List<Integer> myLists = new ArrayList<>();
//        for(int i=0; i < strSum3.length(); i++){
//            myLists.add( Integer.parseInt( strSum3.charAt(i)+"" ) );
//        }
//        return myLists;





//       if( lst1.size() == 0 || lst2.size() == 0 ) throw new UnsupportedOperationException();
//       List<Integer> resultTemp = new ArrayList<>();
//       int len1 = lst1.size();
//       int len2 = lst2.size();
//       //int lengthMax = ( len1 > len2 ) ? lst1.size() : lst2.size();
//       int lengthMax = 0;
//       if ( len1 > len2 ) lengthMax = lst1.size() ;
//       else lengthMax = lst2.size();
//       int overflow = 0;
//       int num1 = 0;
//       int num2 = 0;
//       for( int i =0 ; i < lengthMax   ;  i++ ) {
//           if( len1 - i - 1 < 0 ) num1 = 0;
//           else num1 = Integer.parseInt( lst1.get( len1 - i - 1 ) + "" );
//           if( len2 - i -1 < 0 ) num2 = 0;
//           else num2 = Integer.parseInt( lst2.get( len2 - i - 1) + "" );
//           int sumTemp = num1 + num2 + overflow;
//           if( sumTemp <= 9) {
//               resultTemp.add( sumTemp );
//               overflow = 0;
//           }
//           else {
//               resultTemp.add( sumTemp % 10 );
//               overflow = 1;
//           }
//       }
//       List<Integer> result = new ArrayList<>();
//       if ( overflow == 1 ) resultTemp.add(1);
//       for(int i =0; i< resultTemp.size(); i++){
//           result.add( resultTemp.get(resultTemp.size() - i - 1));
//       }
//       return result;
//   }
// }






//     String sum = "";
//     for( int i =0 ; i < lst1.size()   ;  i++ ) {
//         sum = sum + lst1.get(i);
//     }
// //        System.out.println("sum:" + sum);
//     String sum2 = "";
//     for( int i =0 ; i < lst2.size()   ;  i++ ) {
//         sum2 = sum2 + lst2.get(i);
//     }
// //        System.out.println("sum2:" + sum2);
//     int sum3 = Integer.parseInt(sum) + Integer.parseInt(sum2);
// //        System.out.println("sum3:" + sum3);
//     // change value to lists.
//     String strSum3 = String.valueOf(sum3);
//     List<Integer> myLists = new ArrayList<>();
//     for(int i=0; i < strSum3.length(); i++){
//         myLists.add( Integer.parseInt( strSum3.charAt(i)+"" ) );
//     }
//     return myLists;
//    }


   public static List<Integer> add(List<Integer> lst1, List<Integer> lst2) {
    /*
    * This function adds the elements of two lists
    * starts addition from the right ends of the list
    * if the sum is greater than 9 then add carry 1 to the
    * next left element. so on till end of the lists
    */
    int l1 = lst1.size() - 1;   //get length of first list
    int l2 = lst2.size() - 1;   //get length of second list
    int sum, carry;               //to store sum and carry
    //a new empty list to store result
    List<Integer> result = new ArrayList<Integer>();
    carry = 0;       //set initial carry as 0
    //loop till none of the list indices reach end
    while(l1 >= 0 && l2 >= 0){
        //add numbers from list1 and list2 with carry
        sum = lst1.get(l1) + lst2.get(l2) + carry;
        if(sum > 9){
            //sum is greater than 9
            //subtract 10 from sum
            sum = sum - 10;
            //set carry as 1
            carry = 1;
        }
        else{
            //sum is less than 10
            //so, carry is 0
            carry = 0;
        }
        //add sum to the resultant list at index 0
        result.add(0, sum);
        //decrement list1 and list2 indices by 1
        l1--; l2--;
    }
   
    while(l1 >= 0){
        //first list has more numbers to be added
        //but second list has no more elements
        sum = lst1.get(l1) + carry;   //just add carry to list1 numbers
        if(sum > 9){
            //sum is greater than 9
            //subtract 10 from sum
            sum = sum - 10;
            //set carry as 1
            carry = 1;
        }
        else{
            //sum is less than 10
            //so, carry is 0
            carry = 0;
        }
        //add sum to the resultant list at index 0
        result.add(0, sum);
        //decrement list1 index by 1
        l1--;
    }
   
    while(l2 >= 0){
        //second list has more numbers to be added
        //but first list has no more elements
        sum = lst2.get(l2) + carry;   //just add carry to list2 numbers
        if(sum > 9){
            //sum is greater than 9
            //subtract 10 from sum
            sum = sum - 10;
            //set carry as 1
            carry = 1;
        }
        else{
            //sum is less than 10
            //so, carry is 0
            carry = 0;
        }
        //add sum to the resultant list at index 0
        result.add(0, sum);
        //decrement list2 index by 1
        l2--;
    }
   
    //finally there is a carry
    //add that carry to the resultant list
    if(carry != 0)
        result.add(0, carry);
   
    //return resultant list
    return result;
}

}