/**
 * Class Sort sorts n numbers in ascending and descending ways.
 *
 * @version 1.2 01 Mar 2019
 * @author Tomer Yona
 */

public class Sort {

    /**
     * main function.
     * <p>
     * Longer description. If there were any, it would be here.
     * <p>
     * And even more explanations to follow in consecutive
     * paragraphs separated by HTML paragraph breaks.
     *
     * @param args Description text text text.*/
    public static void main(String[] args) {

        int[] numbers = stringsToInts(args);
        if (args[0].equals("asc")) {
            System.out.print("bubbleSortAsc : ");
            bubbleSortAsc(numbers);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        } else {
            System.out.print("bubbleSortDesc : ");
            bubbleSortDesc(numbers);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }


    }

    /**
     * stringsToInts converts an array of strings to an array of ints.
     * @param numbers  description
     * @return int[]
     */
    public static int[] stringsToInts(String[] numbers) {
        int[] ans = new int[numbers.length - 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Integer.parseInt(numbers[i + 1]);
        }
        return ans;
    }

    /**
     * bubbleSortAsc sorts a given array.
     * @param numbers  array of ints
     * @return int[] sorted in ascending way
     */
    public static int[] bubbleSortAsc(int[] numbers) {

        int n = numbers.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    //swap elements
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        return numbers;


    }

    /**
     * bubbleSortDesc sorts a given array.
     * @param numbers  array of ints
     * @return int[] sorted in descending way
     */
    public static int[] bubbleSortDesc(int[] numbers) {

        int n = numbers.length;
        int temp;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        return numbers;


    }



}
