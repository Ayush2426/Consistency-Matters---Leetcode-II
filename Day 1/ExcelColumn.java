public class ExcelColumn {
    public int checkColNum(String s){
        int result = 0;
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            int cal = c[i] - 65 + 1;
            result = result * 26 + cal;
        }
        return result;
    }
    public static void main(String[] args) {
        ExcelColumn ec = new ExcelColumn();
        ec.checkColNum("AB");
    }
}
