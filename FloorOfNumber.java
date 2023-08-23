public class FloorOfNumber {
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 14, 16, 18};
        // int[] arr = {2, 1, -2, -9, -14, -16, -18};
        int target = 1;
        int ceil = searchCeilingNumber(arr, target);
        System.out.println("Floor value of "+target+" is : "+ceil);
    }

    static int searchCeilingNumber(int[] arr, int key){
        int low=0;
        int high = arr.length -1;
        boolean isAsc = arr[low] < arr[high];
        int res = 0;

        if(key < arr[low]){
            return -1;
        }
        while(low <= high){
            int mid = low +(high - low ) / 2;
            if(arr[mid] == key){
                return mid;
            }
           if(isAsc){
            if(arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
            res = high;
           }
           else{
            if(arr[mid] > key){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
            res = low;
           }
        }
        return arr[res];
        
    }
}
