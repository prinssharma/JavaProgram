public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        // int[] arr = {2, 1, -2, -9, -14, -16, -18};
        int target = 20;
        int ceil = searchCeilingNumber(arr, target);
        System.out.println("Ceil value of "+target+" is : "+ceil);
    }

    static int searchCeilingNumber(int[] arr, int key){

        int low=0;
        int high = arr.length -1;
        boolean isAsc = arr[low] < arr[high];
        int res = 0;

        if(key > arr[high]){
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
            res = low;
           }
           else{
            if(arr[mid] > key){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
            res = high;
           }
        }
        return arr[res];
        
    }
}
