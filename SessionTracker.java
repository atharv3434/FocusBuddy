import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class SessionTracker {
    public static void logSession(int cycles, int work, int breakTime) {
        try (FileWriter writer = new FileWriter("focus_sessions.txt", true)) {
            writer.write("\n--- Session on " + LocalDateTime.now() + " ---\n");
            writer.write("Pomodoros completed: " + cycles + "\n");
            writer.write("Work duration: " + work + " mins\n");
            writer.write("Break duration: " + breakTime + " mins\n");
            writer.write("Total Focus Time: " + (work * cycles) + " mins\n");
        } catch (IOException e) {
            System.out.println("❌ Could not write session log.");
        }
    }
}
