

public class Sort {

    public static void main(String args[]){

        int[] numbers = stringsToInts(args);
        if( args[0].equals("asc")){
            System.out.print("bubbleSortAsc : ");
            bubbleSortAsc(numbers);
            for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i]+" ");
            }
        }

        else{
            System.out.print("bubbleSortDesc : ");
            bubbleSortDesc(numbers);
            for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i]+" ");
            }
        }


    }


    public static int[] stringsToInts(String[] numbers){
        int ans[] = new int[numbers.length-1];
        for (int i = 0; i < ans.length; i++){
            ans[i] = Integer.parseInt(numbers[i+1]);
        }
        return ans;
    }

    public static int[] bubbleSortAsc(int[] numbers) {

        int n = numbers.length;
        int temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(numbers[j-1] > numbers[j]){
                    //swap elements
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        return numbers;


    }


    public static int[] bubbleSortDesc(int[] numbers) {

        int n = numbers.length;
        int temp;
        for (int i = 0; i < ( n - 1 ); i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j+1])
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        return numbers;


    }

    public static void swap(int i, int j){
        int temp;
        temp = i;
        i = j;
        j= temp;

    }

}
