public class StopWatch {
    private long startTime, endTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public void Start(){
        this.startTime = System.currentTimeMillis();
    }

    public void Stop(){
        this.endTime = System.currentTimeMillis();
        System.out.println("StopWatch: " + getElapsedTime() + " milliseconds");
    }

    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
