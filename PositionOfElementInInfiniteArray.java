public class PositionOfElementInInfiniteArray {
    public static void main(String[] args) {
        
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(searchElement(arr, target));

    }

    static int searchElement(int arr[], int target){

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + 2 * (end - start + 1 );
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        
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
