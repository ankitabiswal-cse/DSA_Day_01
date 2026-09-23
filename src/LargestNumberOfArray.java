public class LargestNumberOfArray {
    public static void main(String[] args){
        int[] arr = {34,90,87,65,89,43,50,78,67,45};
        int largest = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Number Of An Array :"+largest);
    }
}
