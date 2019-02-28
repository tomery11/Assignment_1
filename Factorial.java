
/**
 * Class Factorial calculates the factorial of a given int two different ways: iteratively & recursively.
 *
 * @version 1.2 01 Mar 2019
 * @author Tomer Yona
 */
public class Factorial{

  public static void main(String[] args) { // class main
     int n = Integer.parseInt(args[0]);
     System.out.println("recursive: " + factorialRecursive(n));
     System.out.println("iterative: " + factorialIter(n));

     }



    /**
     * ...method doSomethingElse documentation comment...
     * @param n  description
     * @return long
     */
  public static long factorialIter(long n){ //class name
    long ans = 1;
    //condition
    while(n > 1){
      ans = ans * n;
      n--;
    }
    return ans;
  }

    /**
     * ...method doSomethingElse documentation comment...
     * @param n description
     * @return long
     */
  public static long factorialRecursive(long n){
    long ans = 1;
    if(n==1)
      return ans;
    else{
      return n * factorialRecursive(n-1);
    }

  }


}
