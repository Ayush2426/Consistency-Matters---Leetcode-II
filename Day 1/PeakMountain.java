public class PeakMountain {
    public int peakMountainIndex(int[] arr){
        int i = 0;
        while(arr[i] < arr[i + 1]){
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        PeakMountain pm = new PeakMountain();
        pm.peakMountainIndex(new int[]{1, 2, 4, 2, 1, 0});
    }
}
