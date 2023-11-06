public class Time {
   
    private int hour;
    private int minute; 
    private double second;
    private String extraLabel;
    
    public Time() {
        this.hour = 11;
        this.minute = 59;
        this.second = 0.0;
        extraLabel = "hello";
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

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public double getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    public void setSecond(double second) {
        this.second = second;
    }

    public String toString() {
        // equivalent for returning strings as
        // System.out.printf("%2d %2d %2d", this.hour, this.minute, this.second);
        return String.format("%02d:%02d:%.2f", this.hour, this.minute, this.second);
    }

    public boolean equals(Time that) {
        return this.hour == that.hour && this.minute == that.minute;
    }

    public Time add(Time that) {
        Time sumTime = new Time();
        sumTime.hour = this.hour + that.hour;
        sumTime.minute = this.minute + that.minute;
        sumTime.second = this.second + that.second;
        return sumTime;
    }

    public static void main(String[] args) {

        Time preciseTime = new Time(10, 47, 29.23938494829);
        System.out.println(preciseTime);

        System.out.println(preciseTime.hour);
    }


}
