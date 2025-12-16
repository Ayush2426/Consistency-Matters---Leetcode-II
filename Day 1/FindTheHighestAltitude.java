public class FindTheHighestAltitude {
    public int findMaxHeight(int[] gain){
        int max = 0;
        int current = 0;
        for(int i = 0; i < gain.length; i++){
            current += gain[i];
            max = Math.max(current, max);
        }
        return max;
    }
    public static void main(String[] args) {
        FindTheHighestAltitude ftha = new FindTheHighestAltitude();
        ftha.findMaxHeight(new int[]{1, 2, -1, 0, 5, 4});
    }
}
