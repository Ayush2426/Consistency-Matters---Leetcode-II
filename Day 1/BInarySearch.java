public class BInarySearch {
    public int Search(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        BInarySearch bs = new BInarySearch();
        bs.Search(new int[]{1, 2, 3, 4, 5}, 3);
    }
}
