package domain;

import java.util.List;

public class ResistanceReport {

    public void printReport(List<EvaluateResistance> robots) {
        System.out.println("=== Resilience Test Reports ===\n");
        robots.forEach(robot -> {
            System.out.println(robot.getResistance());
            System.out.println();
        });
    }
}
