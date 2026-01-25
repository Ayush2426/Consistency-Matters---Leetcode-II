public class MissingNumber {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int sumWithoutMissing = 0;
        
        for(int i = 0; i < nums.length; i++){
            sumWithoutMissing += nums[i];
        }

        int sumWithMissing = (n * (n + 1)) / 2;
        int missingNum = sumWithMissing - sumWithoutMissing;
        return missingNum;
    }

    public static void main(String[] args) {
        MissingNumber ms = new MissingNumber();
        ms.missingNumber(new int[]{1, 7});
    }
}
