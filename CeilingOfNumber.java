public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 13;
        int ceil = searchCeilingNumber(arr, target);
        System.out.println("Ceil value of "+target+" is : "+ceil);
    }

    static int searchCeilingNumber(int[] arr, int key){
        int low=0;
        int high = arr.length -1;
        boolean isAsc = arr[low] < arr[high];
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
           }
           else{
            if(arr[mid] > key){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
           }
        }
        return arr[low];
        
    }
}
