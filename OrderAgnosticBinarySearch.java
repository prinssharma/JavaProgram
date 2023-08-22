public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr1 = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
        int[] arr2 = {4, 2, 1, -1, -2, -4, -8, -9, -36, -40};
        int target = 28;
        int target1 = -8;

        int atIndex = binarySearch(arr1, target);
        System.out.println("Target "+ target +" found at index of arr1 : "+atIndex);

        int atIndex2 = binarySearch(arr2, target1);
        System.out.println("Target "+ target1 +"  found at index of arr2 : "+atIndex2);
        
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
