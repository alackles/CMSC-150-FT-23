import java.awt.Point;

public class Time {
   
    private int hour;
    private int minute; 
    private double second;
    private String extraLabel;
    
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time (int h, int m) {
        this.hour = h;
        this.minute = m;
        this.second = 0.0;
    }
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        // equivalent for returning strings as
        // System.out.printf("%2d %2d %2d", this.hour, this.minute, this.second);
        return String.format("Time[hour=%02d, minute=%02d, seconds=%02.2f]", this.hour, this.minute, this.second);
    }

    public static void main(String[] args) {
        Time myTime = new Time();
        Time noonthirty = new Time(12, 30);
        Time preciseTime = new Time(10, 47, 29.23938494829);
        System.out.println(myTime);
        System.out.println(noonthirty);
        System.out.println(preciseTime);
        String timestring = myTime.toString();

        Point p = new Point(20, 25);
        System.out.println(p.x);
        System.out.println(preciseTime.hour);

    }

}
