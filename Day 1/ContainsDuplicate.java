
import java.util.Arrays;

public class ContainsDuplicate {
    public boolean checkDuplicate(int[] nums){
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        cd.checkDuplicate(new int[]{1, 2, 3, 1});
    }
}
