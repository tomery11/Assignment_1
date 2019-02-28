public class DescribeNumbers{

  public static void main(String args[]){

    int[] numbers = stringsToInts(args);
    System.out.println("min : " + min(numbers));
    System.out.println("max : " +max(numbers));
    System.out.println("avg : " +avg(numbers));

  }


    public static int[] stringsToInts(String[] numbers){
        int ans[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            ans[i] = Integer.parseInt(numbers[i]);
        }
      return ans;
    }

    public static int min(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < min){
            min = numbers[i];
            }
        }
        return min;
    }



    public static int max(int[] numbers){
        int max = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
    public static float avg(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum/numbers.length;
    }






}
