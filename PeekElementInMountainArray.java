public class PeekElementInMountainArray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.print("Maximum element is present at index : ");
        System.out.println(peekElement(arr));

    }

    static int peekElement(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    
}
