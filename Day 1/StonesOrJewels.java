
import java.util.HashSet;
import java.util.Set;

public class StonesOrJewels {
    public int FindStonesOrJewels(String Stone, String Jewel){
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char stone : Jewel.toCharArray()){
            set.add(stone);
        }
        for(char stone : Stone.toCharArray()){
            if(set.contains(stone)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        StonesOrJewels soj = new StonesOrJewels();
        soj.FindStonesOrJewels("aA", "Aaaaaaa");
    }
}
