public class Factorial{

  public static void main(String[] args) { // class main
     int n = Integer.parseInt(args[0]);
     System.out.println("iterative: " + factorialIter(n));
     System.out.println("recursive: " + factorialRecursive(n));
     }




  public static long factorialIter(long n){
    long ans = 1;
    while(n > 1){
      ans = ans * n;
      n--;
    }
    return ans;
  }


  public static long factorialRecursive(long n){
    long ans = 1;
    if(n==1)
      return ans;
    else{
      return n * factorialRecursive(n-1);
    }

  }


}
