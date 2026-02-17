import java.util.Scanner;

public class HappyNumber {
    public boolean checkHappyNumber(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        
        while(num != 1 || num != 4){
            while(num > 0){
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        if(num == 1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        HappyNumber hn = new HappyNumber();
        hn.checkHappyNumber();
    }
}
