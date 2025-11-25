public class Maximum1count {
    public int count1(int[] nums){
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Maximum1count m1c = new Maximum1count();
        m1c.count1(new int[]{1, 1, 0, 1, 0, 1, 1, 1, 1});
    }
}
