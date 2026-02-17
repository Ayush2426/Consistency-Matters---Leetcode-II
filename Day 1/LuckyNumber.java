import java.util.Scanner;

public class LuckyNumber {
    public boolean checkLuckyNumber(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int f = num / 100;
        int s = (num / 10) % 10;
        int t = num % 10;

        int sum = f + t;
        
        if(num < 100 || num < 999){
            return false;
        }else if(num == sum){
            return true;
        }else{
            return false;
        }
    }
}
