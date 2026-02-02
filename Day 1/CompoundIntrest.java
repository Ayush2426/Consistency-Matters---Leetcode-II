import java.util.Scanner;
public class CompoundIntrest {
    public double findCI(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter number of intrest applied: ");
        double n = sc.nextDouble();
        System.out.print("Enter time: ");
        double t = sc.nextDouble();

        double A = p * Math.pow((1 + (r / 100) / n), n * t);
        double ci = A - p;
        
        System.out.println("The compound intrest for the given data is: 0" +String.format("%.3f", ci));
        sc.close();
        return ci;
    }
    public static void main(String[] args){
        CompoundIntrest ci = new CompoundIntrest();
        ci.findCI();
    }
}
