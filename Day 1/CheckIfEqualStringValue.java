public class CheckIfEqualStringValue {
    public boolean  compareStringValue(String[] word1, String[] word2){
        StringBuilder sb1 = new StringBuilder();
        for(String word : word1){
            sb1.append(word);
        }

        StringBuilder sb2 = new StringBuilder();
        for(String word : word2){
            sb2.append(word);
        }

        if(sb1.equals(sb2)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        CheckIfEqualStringValue ciesv = new CheckIfEqualStringValue();
        ciesv.compareStringValue(new String[]{"a", "bc", "def"}, new String[]{"abcdefg"});
    }
}
