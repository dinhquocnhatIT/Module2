public class MainStopWatch {
    public static void main(String[] args) {
       StopWatch sw = new StopWatch();
       sw.start();
        System.out.printf("Start: %d\n  ", sw.getStartTime());
        sw.stop();
        System.out.printf("End: %d\n", sw.getEndTime());
        System.out.printf("ElapsedTime %d\n", sw.getElapsed());
    }
}
