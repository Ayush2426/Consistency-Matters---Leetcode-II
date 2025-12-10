public class DelayedArrivalTime {
    public int calculateArrivalTime(int arrivalTime, int delayedTime){
        int arrival = 0;
        arrival = arrivalTime + delayedTime;
        if(arrival >= 24){
            arrival = arrival % 24;
        }
        return arrival;
    }
    public static void main(String[] args) {
        DelayedArrivalTime dat = new DelayedArrivalTime();
        dat.calculateArrivalTime(12, 2);
    }
}
