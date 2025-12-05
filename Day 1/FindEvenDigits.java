public class FindEvenDigits {
    public int findEvenDig(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int numOfDigits = 0;
            while(nums[i] != 0){
                nums[i] = nums[i]/10;
                numOfDigits++;
            }
            if(numOfDigits % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        FindEvenDigits fed = new FindEvenDigits();
        fed.findEvenDig(new int[]{1, 21, 22, 333, 222, 2222});
    }
}
