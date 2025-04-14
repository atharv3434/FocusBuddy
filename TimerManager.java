public class TimerManager {
    public static void startTimer(int minutes, String type) {
        int totalSeconds = minutes * 60;

        try {
            while (totalSeconds > 0) {
                int mins = totalSeconds / 60;
                int secs = totalSeconds % 60;
                System.out.printf("%s - %02d:%02d\r", type, mins, secs);
                Thread.sleep(1000);
                totalSeconds--;
            }
            System.out.println("\n🔔 " + type + " session over!");
        } catch (InterruptedException e) {
            System.out.println("⛔ Timer interrupted.");
        }
    }
}
