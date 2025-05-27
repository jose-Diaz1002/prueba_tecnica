package competition.models;


import competition.models.enums.PropulsionSystem;

import java.time.LocalDate;

public class WaterRobot extends Robot {

    private double maximumDepth;
    private PropulsionSystem propulsionSystem;

    public WaterRobot(String name, String manufacturer, int yearManufacture, LocalDate dateRegistrationCompetition, double maximumDepth, PropulsionSystem propulsionSystem) {
        super(name, manufacturer, yearManufacture, dateRegistrationCompetition);
        this.maximumDepth = maximumDepth;
        this.propulsionSystem = propulsionSystem;
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + ", alcanza una profundidad de " + maximumDepth + " metros, con propulsion tipo " + propulsionSystem + ", fabricado en " + getManufacturer() + " en el año " + getYearManufacture() + ".";

    }
}
