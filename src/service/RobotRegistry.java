package service;

import domain.EvaluateResistance;
import models.GroundRobot;
import models.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RobotRegistry {

    private List<Robot> robots = new ArrayList<>();

    public void register(Robot robot) {
        robots.add(robot);
    }

    public List<Robot> listAll() {
        return new ArrayList<>(robots);
    }

    public List<GroundRobot> filterGroundRobotsBySpeed(double minSpeed) {
        return robots.stream()
                .filter(r -> r instanceof GroundRobot)
                .map(r -> (GroundRobot) r)
                .filter(r -> r.getMaximumSpeed() > minSpeed)
                .collect(Collectors.toList());
    }

    public List<Robot> searchByManufacturer(String manufacturer) {
        return robots.stream()
                .filter(r -> r.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());
    }

    public List<EvaluateResistance> getResistanceEvaluables() {
        return robots.stream()
                .filter(r -> r instanceof EvaluateResistance)
                .map(r -> (EvaluateResistance) r)
                .collect(Collectors.toList());
    }

}
