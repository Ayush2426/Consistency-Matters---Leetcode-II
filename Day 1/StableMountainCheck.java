
import java.util.ArrayList;
import java.util.List;

public class StableMountainCheck {
    public List<Integer> findStableMountain(int[] height, int threshold){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < height.length; i++){
            if(height[i - 1] > threshold){
                res.add(height[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        StableMountainCheck smc = new StableMountainCheck();
        smc.findStableMountain(new int[]{1, 2, 4, 5, 3, 2}, 3);
    }
}
