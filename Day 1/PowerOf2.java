public class PowerOf2{
    public boolean poweroftwo(int n){
        long i = 0;
        while(i < n){
            i = i * 2;
        }
        if(i == n){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        PowerOf2 pOf2 = new PowerOf2();
        pOf2.poweroftwo(24);
    }
}