public class ArrangeCharAlternatively {
    public String arrangeAlt(String word1, String word2){
        int len1 = word1.length();
        int len2 = word2.length();
        int min = Math.min(len1, len2);
        String longer = "";
        if(len1 > len2){
            longer = word1;
        }
        if(len2 > len1){
            longer = word2;
        }

        char char1[] = word1.toCharArray();
        char char2[] = word2.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < min; i++){
            sb.append(char1[i]);
            sb.append(char2[i]);
        }
        sb.append(longer.substring(min));
        return sb.toString();
    }
    public static void main(String[] args) {
        ArrangeCharAlternatively aca = new ArrangeCharAlternatively();
        aca.arrangeAlt("abc", "pqr");
    }
}
