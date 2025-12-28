public class CheckKeyChange {
    public int determineKeyChange(String s){
        s = s.toLowerCase();
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i )!= s.charAt(i + 1)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CheckKeyChange ckk = new CheckKeyChange();
        ckk.determineKeyChange("aAbAbACaCcC");
    }
}
