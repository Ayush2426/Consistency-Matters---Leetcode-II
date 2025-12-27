import java.util.Arrays;

public class AssignCookies {
    public int CookiesForChildren(int[] g, int[] s){
        Arrays.sort(s);
        Arrays.sort(g);
        int children = 0;
        int cookie = 0;
        while(cookie < s.length && children < g.length){
            if(s[cookie] > g[children]){
                children++;
            }
            cookie++;
        }
        return children;
    }
    public static void main(String[] args) {
        AssignCookies ac = new AssignCookies();
        ac.CookiesForChildren(new int[]{1, 2, 3}, new int[]{1, 2});
    }
}
