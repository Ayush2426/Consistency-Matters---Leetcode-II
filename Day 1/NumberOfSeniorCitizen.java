public class NumberOfSeniorCitizen {
    public int checkSeniorCitizen(String[] details){
        int count = 0;
        for(int i = 0; i < details.length; i++){
            int age = Integer.parseInt(details[i].substring(11, 13));
            if(age > 60){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        NumberOfSeniorCitizen nosc = new NumberOfSeniorCitizen();
        nosc.checkSeniorCitizen(new String[]{"1234567890F3322", "0987654321M6521"});
    }
}
