public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(hoursAtBeginning, 23);
        this.minutes = new BoundedCounter(minutesAtBeginning, 59);
        this.seconds = new BoundedCounter(secondsAtBeginning, 59);
    }
    
    public void tick() {
        this.seconds.next();

        if (this.seconds.getValue() == 0) {
            this.minutes.next();

            // if minutes become zero, advance hours
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }


    }
    
    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
