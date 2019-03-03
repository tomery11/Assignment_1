/**
 * Class DescribeNumbers calculates the minimum, maximum & average of n numbers.
 *
 * @version 1.2 01 Mar 2019
 * @author Tomer Yona
 */

public class DescribeNumbers {

    /**
     * Short one line description.
     * <p>
     * Longer description. If there were any, it would be here.
     * <p>
     * And even more explanations to follow in consecutive
     * paragraphs separated by HTML paragraph breaks.
     *
     * @param args Description text text text.*/
  public static void main(String[] args) {

    int[] numbers = stringsToInts(args);
    System.out.println("min: " + min(numbers));
    System.out.println("max: " + max(numbers));
    System.out.println("avg: " + avg(numbers));

  }

    /**
     * stringsToInts converts an array of strings to an array of ints.
     * @param numbers  description
     * @return int[]
     */
    public static int[] stringsToInts(String[] numbers) {
        int[] ans = new int [numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ans[i] = Integer.parseInt(numbers[i]);
        }
      return ans;
    }
    /**
     * min computes the minimum value in the given array.
     * @param numbers  array of ints
     * @return int
     */
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
            min = numbers[i];
            }
        }
        return min;
    }


    /**
     * max computes the maximum value in the given array.
     * @param numbers  array of ints
     * @return int
     */
    public static int max(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * avg computes the average value in the given array.
     * @param numbers  array of ints
     * @return int
     */
    public static float avg(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }






}
