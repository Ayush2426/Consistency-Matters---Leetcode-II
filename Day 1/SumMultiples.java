public class SumMultiples {
    public int findSumMultiples(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(i % 3 == 0 || i % 5 == 0 || i % 7 == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SumMultiples sm = new SumMultiples();
        sm.findSumMultiples(21);
    }
}
