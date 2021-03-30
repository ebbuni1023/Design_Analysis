public class Sily {
    public static void main(String [] args){
        System.out.print(silly1(33));
    }

    public static int silly1(int N){
        if(N < 2){
            return 1;
        }
        return silly1(N/3) +silly1(N/3)+silly1(N/3);
    }
}
