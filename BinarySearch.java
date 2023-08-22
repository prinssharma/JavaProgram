public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};

        int target = 16;

        int atIndex = binarySearch(arr, target);
        System.out.println("Target found at index : "+atIndex);
        
    }

    public static int binarySearch(int[] arr, int target) {
        int low=0;
        int high = arr.length -1;
        
        while(low <= high){
            int mid = low +(high - low ) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }

}
