/*
# Optional Lecture 1: Recursion

## Topics
- Why does Recursion work?
  - Example: countdown
- How to write Recursive functions
  - Example: multiply
  - Example: isPalindrome
- Tree Recursion
  - Example: Fibonacci
  - Example: paths
- Advantages and Disadvantages
- What's next? (Beyond this lecture)

*/
class Recursion {
    public static void main(String[] args) {
      countdown(5);
      //System.out.println(multiply(3, 4));
      //System.out.println(isPalindrome(""));
      //System.out.println(isPalindrome("a"));
      //System.out.println(isPalindrome("racecar"));
      //System.out.println(isPalindrome("frenchfry"));
      //System.out.println(fib(4));
      //System.out.println(paths(3, 2));
    }
  
    // Countdown prints all numbers from n to 1, and then prints "Blastoff"
    public static void countdown(int n) {
      if (n < 0) {
        return;
      }
      if (n == 0) {
        System.out.println("Blastoff");
        return;
      }
      System.out.println(n);
      countdown(n-1);
    }
  
    // multiply numbers through repeated addition;
    //   multiply(3, 4) = 3 + 3 + 3 + 3 = 12
    public static int multiply(int a, int b) {
      if (b == 0) {
        return 0;
      }
      return a + multiply(a, b-1);
    }
  
    // returns true when a string is the same backwards and forwards
    //   isPalindrome('racecar') = true
    //   isPalindrome('tacocat') = true
    //   isPalindrome('frenchfry') = false
    public static boolean isPalindrome(String candidate) {
      return isPalindrome(candidate, 0);
    }
  
    // isPalindrome("") = true
    // isPalindrome("a") = true
    private static boolean isPalindrome(String candidate, int i) {
      if (i == candidate.length() / 2) {
        return true;
      } else if (candidate.charAt(i) != candidate.charAt(candidate.length()-i-1)) {
        return false;
      }
      return isPalindrome(candidate, i+1);
    }
  
    public static int fib(int n) {
      if (n < 2) {
        return n;
      }
      return fib(n - 1) + fib(n-2);
    }
    /*            3
                fib(4)
             2  /      \ 1
           fib(3)      fib(2)
         1 /  \ 1      1 /  \ 0
      fib(2)  fib(1)  fib(1) fib(0)
     1 /  \ 0
  fib(1) fib(0)
  
    */
  
  
    // return the number of ways to get from the bottom left corner
    // of an M by N grid to the top right corner moving only right or up.
    public static int paths(int m, int n) {
      if (m == 0 || n == 0) {
        return 0;
      } else if (m == 1 || n == 1) {
        return 1;
      } else {
        return paths(m-1, n) + paths(m, n-1);
      }
    }
  }