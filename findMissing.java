    /*
algorithm findMissing
  Input: integer array A of length N where each element is distinct
    and in the range [0, N]
  Output: integer x where x is in the range [0, N], but not in A

  s = the sum of all numbers in A
  return (N(N+1))/2 - s
  */
class findMissing {
    public static void main(String[] args) {
      System.out.println("-----Q1-----");
      int testResult1 = findMissing(new int[] {0, 1, 2, 4, 5});
      System.out.println(testResult1); // should output 3
  
      int testResult2 = findMissing(new int[] {5, 0, 4, 3, 1});
      System.out.println(testResult2); // should output 2
  
      int testResult3 = findMissing(new int[] {});
      System.out.println(testResult3); // should output 0
  
      int testResult4 = findMissing(new int[] {9, 3, 5, 1, 4, 8, 2, 10, 0, 6});
      System.out.println(testResult4); // should output 7
    }
    public static int findMissing2(int[] arr){
      // 0~N까지 더한 합계 : s
      // 배열의 합계 : k
      // 정답 = s -k
    int N = arr.length;
    
    int s = ((N * (N + 1)) / 2); //지영씨가 계산
    for(int i = 0; i < arr.length; i++){
      s = s - arr[i];
    }
    return s;
    }
  
    public static int findMissing3(int[] arr){
      // 0~N까지 더한 합계 : s
      // 배열의 합계 : k
      // 정답 = s -k
    int N = arr.length;
  
    int s = 0;
    for(int i = 0; i <= arr.length; i++){
      s = s + i;
    }
  
    int k = 0;
    for(int i = 0; i < arr.length; i++){
      k = k + arr[i];
    }
  
    int result = s - k;
    return result;
    }
  
    public static int findMissing(int[] arr){
      // 0~N까지 있어야하는데, 1개없다.
      // 순차적으로 찾아서 없으면 그값.
     
     for(int i = 0; i <= arr.length; i++){
       boolean found = false;
       for(int j = 0; j < arr.length; j++){
          if( arr[j] == i ) found = true;
       }
       if( found == false ) return i; // 결과
      } 
    return -1;
    }
  }
  