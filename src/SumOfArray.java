public class SumOfArray {
    public static void main(String[] args){
        int[] arr = {25,35,19,34,76,65,89};
        int sum = 0;

        for(int i = 0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
            System.out.println("Sum Of Array :"+sum);
        }
    }

