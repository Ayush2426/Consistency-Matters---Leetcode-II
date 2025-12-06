import java.util.Arrays;
public class MaxProdOfTwoEL{
    public int findMaxProd(int[] nums){
        Arrays.sort(nums);
        int firstEl = nums[nums.length - 1];
        int secEl = nums[nums.length - 2];
        int MaxProd = (firstEl - 1) * (secEl - 1);
        return MaxProd;
    }
    public static void main(String[] args) {
        MaxProdOfTwoEL mpotel = new MaxProdOfTwoEL();
        mpotel.findMaxProd(new int[]{3, 4, 2, 5, 7, 8});
    }
}