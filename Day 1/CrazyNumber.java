import java.util.Scanner;
public class CrazyNumber {
    public boolean CheckCrazyNumber(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0, product = 1;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        if(num == sum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        CrazyNumber cn = new CrazyNumber();
        cn.CheckCrazyNumber();
    }
}
