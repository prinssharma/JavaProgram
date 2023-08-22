public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
        int[] arr1 = {4, 2, 1, -1, -2, -4, -8, -9, -36, -40};
        int target = 1;

        int atIndex = binarySearch(arr1, target);
        System.out.println("Target found at index : "+atIndex);
        
    }

    
    public static int binarySearch(int[] arr, int target) {
        int low=0;
        int high = arr.length -1;
        boolean isAsc = arr[low] < arr[high];
        while(low <= high){
            int mid = low +(high - low ) / 2;
            if(arr[mid] == target){
                return mid;
            }
           if(isAsc){
            if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
           }
           else{
            if(arr[mid] > target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
           }
        }
        return -1;
    }

}
