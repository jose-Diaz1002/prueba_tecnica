package competition.models;



import competition.domain.EvaluateResistance;
import competition.models.enums.TractionType;

import java.time.LocalDate;

public class GroundRobot extends Robot implements EvaluateResistance {
    private double maximumSpeed;
    private TractionType tractionType;

    public GroundRobot(String name, String manufacturer, int yearManufacture, LocalDate dateRegistrationCompetition, double maximumSpeed, TractionType tractionType) {
        super(name, manufacturer, yearManufacture, dateRegistrationCompetition);
        this.maximumSpeed = maximumSpeed;
        this.tractionType = tractionType;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public TractionType getTractionType() {
        return tractionType;
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + ", fabricado por " + getManufacturer() + ", en el año " + getYearManufacture() + ", usa traccion de " + tractionType + " y alcaza una velocidad maxima de " + maximumSpeed + " km/h.";

    }

    @Override
    public String getResistance() {

        if (tractionType.equals(TractionType.ORUGAS)) {
            return getName() + ": con traccion " + tractionType + " confirmed. Elegible for competition";
        } else {
            return getName() + ": not eligible, la traccion " + tractionType + " no permitida";
        }
    }
}
