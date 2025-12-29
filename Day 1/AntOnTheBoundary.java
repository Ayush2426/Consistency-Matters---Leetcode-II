public class AntOnTheBoundary {
    public int returnToBoundary(int[] nums){
        int sum = 0; int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        AntOnTheBoundary aotb = new AntOnTheBoundary();
        aotb.returnToBoundary(new int[]{1, 2, 3, 4, -7});
    }
}
