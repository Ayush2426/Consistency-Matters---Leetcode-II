public class NumberDigitGame {
    public boolean checkDigitGame(int[] nums){
        int doubleDigit = 0, singleDigit = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 10){
                singleDigit += nums[i];
            }else{
                doubleDigit += nums[i];
            }
        }
        if(singleDigit != doubleDigit){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        NumberDigitGame ndg = new NumberDigitGame();
        ndg.checkDigitGame(new int[]{1, 2, 3, 4, 10});
    }
}
