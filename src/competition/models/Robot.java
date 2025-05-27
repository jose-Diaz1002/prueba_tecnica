package competition.models;

import java.time.LocalDate;

public abstract class Robot {
    private String name;
    private String manufacturer;
    private int yearManufacture;
    private LocalDate dateRegistrationCompetition;


    public Robot(String name, String manufacturer, int yearManufacture, LocalDate dateRegistrationCompetition) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearManufacture = yearManufacture;
        this.dateRegistrationCompetition = dateRegistrationCompetition;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public LocalDate getDateRegistrationCompetition() {
        return dateRegistrationCompetition;
    }

    public abstract String getTechnicalDescription();

}
