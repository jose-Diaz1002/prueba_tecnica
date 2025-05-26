package domain;

import java.util.List;

public class ResistanceReport {

    public void printReport(List<EvaluateResistance> robots) {

        robots.forEach(robot -> {
            System.out.println(robot.getResistance());
        });
    }
}
