public class TimeClient {
    
    public static void main(String[] args) {
        Time myTime = new Time();
        Time noonthirty = new Time(12, 30);
        Time preciseTime = new Time(10, 47, 29.23938494829);
        System.out.println(myTime);
        System.out.println(noonthirty);
        System.out.println(preciseTime);

        System.out.println(preciseTime.getHour());
        preciseTime.setHour(20);
        System.out.println(preciseTime.getHour());

        Time time1 = new Time(12, 15, 28.3);
        Time time2 = new Time(12, 15, 28.3);
        Time time3 = time1;
        System.out.print("Time 1, Time 2 ");
        System.out.println(time1 == time2);
        System.out.print("Time 1, Time 3 ");
        System.out.println(time1 == time3);
        System.out.println(time1.equals(time2));

        Time t1 = new Time(9, 50);
        Time t2 = new Time(1, 30);
        Time t3 = t1.add(t2);
        System.out.println(t3);
    }
}
