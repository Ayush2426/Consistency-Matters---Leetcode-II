public class MaxCountOfPosOrNeg {
    public int checkMaxSignCount(int[] numbers){
        int negative = 0, positive = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                positive++;
            }else if(numbers[i] < 0){
                negative++;
            }
        }
        return Math.max(positive, negative);
    }
    public static void main(String[] args) {
        MaxCountOfPosOrNeg mcopon = new MaxCountOfPosOrNeg();
        mcopon.checkMaxSignCount(new int[]{1, 2, -2, -1, 0, 0, -5});
    }
}
