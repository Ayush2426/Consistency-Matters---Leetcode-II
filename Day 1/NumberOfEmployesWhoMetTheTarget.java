public class NumberOfEmployesWhoMetTheTarget {
    public int checkEmployeeTarget(int[] employees, int target){
        int count = 0;
        for(int i = 0; i < employees.length; i++){
            if(employees[i] >= target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOfEmployesWhoMetTheTarget noewmtt = new NumberOfEmployesWhoMetTheTarget();
        noewmtt.checkEmployeeTarget(new int[]{1, 1, 1, 2, 0, 3, 2, 5, 2, 1, 4}, 2);
    }
}
