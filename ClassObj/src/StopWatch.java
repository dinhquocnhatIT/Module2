public class StopWatch {
    private  long startTime;
    private  long endTime;

//constructor
    //methods
   public void  start() {
       this.startTime = System.currentTimeMillis();
   }
   public  void stop() {
       this.endTime = System.currentTimeMillis();
   }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long getElapsed() {
       long elapsed;
        elapsed= endTime - startTime;
       return elapsed;
    }
}
