public class SmallestIndexwithEqualValue {
    public int findSmallestEqualIndex(int[] nums){
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(i % 10 == nums[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        SmallestIndexwithEqualValue siev = new SmallestIndexwithEqualValue();
        siev.findSmallestEqualIndex(new int[]{0, 1, 2});
    }
}
