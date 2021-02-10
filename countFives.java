public class countFives {
    public static void main(String [] args){
        System.out.println(countFives(123467890)); // should output 0
        System.out.println(countFives(555555));    // should output 6
        System.out.println(countFives(15354));     // should output 2
    }
    public static int countFives(int num){
        if(num == 0){
            return 0;
        } else if (num%10 == 5){
            return 1 + countFives(num / 10);
        } else{
            return countFives(num / 10);
        }
    }

    // public static int countFives(int num) {
    //     int digit;
    //     if(num == 0){
    //       return 0;
    //     }
    //     if(num%10 == digit) //This will check for the number we are looking for, in this case 5.
    //     {
    //       return 1 + countFives(num/10, digit); //This adds 1 to the number of times we have found the number we are looking for
    //     }
    //     else{
    //       return countFives(num/10, digit);//This just returns the number of times we have found the number we are looking for without adjusting that number.
    //     }
    //   }
}
