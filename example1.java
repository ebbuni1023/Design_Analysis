public class example1 {
    


    public static void Main(String [] args){

    }
	public static int mystery(List<Integer> lst) {
        if (int N = 1){
            return lst.get(lst-1);
        } else {
           int left = mystery(lst.subList(0, floor (N/2)+1));
           int right = mystery(lst.sublist(floor(N/2)+1), N);
           if (left <= right){
            return left;
           }
           return right;
        }
    }
}
