public class ThreeConsecutiveOdds {
    public boolean checkConsecutiveThreeOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ThreeConsecutiveOdds tco = new ThreeConsecutiveOdds();
        tco.checkConsecutiveThreeOdds(new int[]{1, 2, 3, 5, 7});
    }
}
