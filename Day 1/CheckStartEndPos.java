public class CheckStartEndPos {
    public int[] searchRange(int[] nums, int target){
        if(nums.length == 0){
            return new int[] {-1, -1};
        }
        int start = 0;
        int end = nums.length - 1;
        int res[] = new int[2];

        while(start < end){
            int mid = (start + end) / 2;

            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        if(nums.length != target){
            return new int[]{-1, -1};
        }
        res[0] = start;
        end = nums.length;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        res[1] = start - 1;
        return res;
    }
    public static void main(String[] args) {
        CheckStartEndPos csep = new CheckStartEndPos();
        csep.searchRange(new int[]{1, 2, 3, 4, 5, 2, 6, 7}, 2);
    }
}
