import java.util.Scanner;

public class FocusBuddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🍅 Welcome to FocusBuddy - Your Personal Pomodoro Timer!");

        System.out.print("Enter work session duration (minutes): ");
        int work = sc.nextInt();
        System.out.print("Enter short break duration (minutes): ");
        int shortBreak = sc.nextInt();
        System.out.print("How many Pomodoros today? ");
        int cycles = sc.nextInt();

        for (int i = 1; i <= cycles; i++) {
            System.out.println("\n▶️ Pomodoro " + i + " started!");
            TimerManager.startTimer(work, "Work");

            if (i < cycles) {
                System.out.println("\n🛋️ Take a short break!");
                TimerManager.startTimer(shortBreak, "Break");
            } else {
                System.out.println("\n🎉 All Pomodoros done! Take a long break.");
                TimerManager.startTimer(shortBreak + 5, "Long Break");
            }
        }

        SessionTracker.logSession(cycles, work, shortBreak);
        System.out.println("📝 Session summary saved. Stay productive!");
    }
}
