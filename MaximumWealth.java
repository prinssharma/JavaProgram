public class MaximumWealth {
    
    public static void main(String[] args) {
        
        int[][] accounts = {{1,2,3},{3,2,1}};
        int max = maxWealth(accounts);
        System.out.println(max);

    }
    public static int maxWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int element : account) {
                sum += element;
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
