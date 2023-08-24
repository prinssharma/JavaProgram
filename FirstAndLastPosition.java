public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] res = searchRange(nums, target);
        System.out.print("First and last index of the target "+target+" are : ");
        for (int i : res) {
            System.out.print(i + " ");
        }
        
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
        
    }

    static int search(int[] arr, int target, boolean findStartIndex){

        int res = -1;
        int low=0;
        int high = arr.length -1;
        while(low <= high){
            int mid = low +(high - low ) / 2;
            if(arr[mid] < target){
                low = mid+1;
            }
            else if(arr[mid] > target){
                high = mid -1;
            }
            else{
                res = mid;
                if(findStartIndex){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return res;
    }
}
