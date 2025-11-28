public class FIndTheDifference {
    public char getDifference(String s, String t){
        int Tsum = 0;
        int Ssum = 0;
        
        for(int i = 0; i < s.length(); i++){
            Ssum += s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            Tsum += t.charAt(i);
        }
        int result = Ssum - Tsum;
        return (char) result;
    }
    public static void main(String[] args) {
        FIndTheDifference fitd = new FIndTheDifference();
        fitd.getDifference("abcd", "abcde");
    }
}
