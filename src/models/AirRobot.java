package models;

import domain.EvaluateResistance;

import java.time.LocalDate;

public class AirRobot extends Robot implements EvaluateResistance {

    private double maximumAltitude;
    private int flightAutonomy;

    public AirRobot(String name, String manufacturer, int yearManufacture, LocalDate dateRegistrationCompetition, double maximumAltitude, int flightAutonomy) {
        super(name, manufacturer, yearManufacture, dateRegistrationCompetition);
        this.maximumAltitude = maximumAltitude;
        this.flightAutonomy = flightAutonomy;
    }

    public int getFlightAutonomy() {
        return flightAutonomy;
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + ", vuela hasta " + maximumAltitude + " m durante " + flightAutonomy + "minutos. Fabricado en el año " + getYearManufacture() + " por " + getManufacturer() + ".";

    }

    @Override
    public String getResistance() {
        if (flightAutonomy >= 60) {
            return getName() + ": Eligible for competition, su autonomia " + flightAutonomy + " es mayor o igual a 60 minutos.";
        } else {
            return getName() + ": Not eligible su autonomia de " + flightAutonomy + " es menor a 60 minutos.";
        }
    }
}
