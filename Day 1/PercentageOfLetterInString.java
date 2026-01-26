public class PercentageOfLetterInString {
    public int letterPercentage(String s, char letter){
        int count[] = new int[26];
        int len = s.length();
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        int freq = count[letter - 'a'];
        int percentage = (freq * 100) / len;
        return percentage;
    }
    public static void main(String[] args) {
        PercentageOfLetterInString pInString = new PercentageOfLetterInString();
        pInString.letterPercentage("avkp2426", 'a');
    }
}
