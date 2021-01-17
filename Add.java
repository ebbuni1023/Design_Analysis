public class Add {
    public static void main(String [] args){
        List<Integer> testResult5 = add(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 2));
    List<Integer> testResult6 = add(Arrays.asList(9, 9, 9), Arrays.asList(1));
    List<Integer> testResult7 = add(Arrays.asList(9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 7, 5, 8, 0, 7), Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(testResult5); // should output [3, 6, 5]
    System.out.println(testResult6); // should output [1, 0, 0, 0]
    System.out.println(testResult7); // should output [9, 2, 2, 3, 3, 7, 2, 0, 3, 6, 8, 5, 4, 7, 8, 8, 1, 5, 2]
    }

    public static List<Integer> add(List<Integer> lst1, List<Integer> lst2) {
        throw new UnsupportedOperationException("add not yet written");
      }
    
}
