public class FIndMinRotatedArray {
    public int findminrotarr(int[] nums){
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            int mid = (i + j) / 2;
            if(nums[mid] > nums[j]){
                i = mid + 1;
            }else{
                j = mid;
            }
        }
        return nums[j];
    }
    public static void main(String[] args) {
        FIndMinRotatedArray fimra = new FIndMinRotatedArray();
        fimra.findminrotarr(new int[]{3, 4, 5, 1, 2});
    }
}
