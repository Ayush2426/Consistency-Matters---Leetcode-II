import java.util.Scanner;

public class SpecialNumber {
    public boolean checkSpecialNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if the number is special or not: ");
        int d = sc.nextInt();

        int num = d, sum = 1, fact;
        while (num != 0) {
            int digit = num % 10;
            fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            num = num / 10;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        SpecialNumber sn = new SpecialNumber();
        sn.checkSpecialNumber();
        // 
    }
}
