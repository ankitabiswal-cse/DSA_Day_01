public class SmallestNumberOfArray {
    public static void main(String[] args){
        int[] arr = {29,45,36,3,45,67,1,90,0,89};
        int smallest = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest Number Of Array ="+smallest);
    }
}
