public class Sort {

    public static void main(String args[]){
        int[] numbers = stringsToInts(args);
        //System.out.println("max : " +max(numbers));
        //System.out.println(" : " +avg(numbers));

    }


    public static int[] stringsToInts(String[] numbers){
        int ans[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            ans[i] = Integer.parseInt(numbers[i]);
        }
        return ans;
    }

    public int[] bubbleSortAsc(int[] numbers) {

        int n = numbers.length;

        boolean swapped = false;
        for (int i = 1; i <= n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                /* swap them and remember something changed */
                swap(numbers[i], numbers[i + 1]);
                swapped = true;
            }
            /* swap them and remember something changed */
        }

        return numbers;


    }


    public int[] bubbleSortdesc(int[] numbers) {

        int n = numbers.length;

        boolean swapped = false;
        for (int i = 1; (i <= n - 1) & !swapped; i++) {
            if (numbers[i] < numbers[i + 1]) {
                /* swap them and remember something changed */
                swap(numbers[i], numbers[i + 1]);
                swapped = true;
            }
            /* swap them and remember something changed */
        }

        return numbers;


    }

    public void swap(int i, int j){
        int temp;
        temp = i;
        j= temp;
        i = j;
    }

}
