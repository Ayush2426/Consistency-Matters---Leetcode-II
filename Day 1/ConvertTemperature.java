public class ConvertTemperature {
    public double[] conTemp(double celcius){
        double answer[] = new double[2];
        double kelvin = celcius + 273.15;
        double farenhiet = (celcius * 1.80) + 32.00;
        answer[0] = kelvin;
        answer[1] = farenhiet;
        return answer;
    }
    public static void main(String[] args) {
        ConvertTemperature ct = new ConvertTemperature();
        ct.conTemp(30.32);
    }
}
