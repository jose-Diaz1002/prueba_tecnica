package competition;



import competition.domain.ResistanceReport;
import competition.models.AirRobot;
import competition.models.GroundRobot;
import competition.models.WaterRobot;
import competition.models.enums.PropulsionSystem;
import competition.models.enums.TractionType;
import competition.service.RobotRegistry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        RobotRegistry registry = new RobotRegistry();

        registry.register(new GroundRobot("Glitch", "AeroDynamics", 2022, LocalDate.now(), 50, TractionType.ORUGAS));
        registry.register(new GroundRobot("Clank", "BioCorp", 2020, LocalDate.now(), 70, TractionType.ORUGAS));
        registry.register(new GroundRobot("Kernel", "ZeroCool ", 2000, LocalDate.now(), 70, TractionType.RUEDAS));
        registry.register(new WaterRobot("AquaNova", "Nanotech", 2010, LocalDate.now(), 89, PropulsionSystem.CHORRO));
        registry.register(new WaterRobot("Vector", "Iris", 2007, LocalDate.now(), 8000, PropulsionSystem.HELICE));
        registry.register(new AirRobot("Polaris", "AeroDynamics", 2003, LocalDate.now(), 3000, 75));
        registry.register(new AirRobot("DroneGuard", "Aeroprototype", 2025, LocalDate.now(), 2500, 45));

        System.out.println("\n=== All Registered Robots ===\n");
        registry.listAll().forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println("\n=== Ground Robots with Speed > 60 km/h ===\n");
        registry.filterGroundRobotsBySpeed(60).forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println("\n=== Robots by Manufacturer: AeroDynamics ===\n");
        registry.searchByManufacturer("AeroDynamics").forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println("\n=== Resilience Test Reports ===\n");
        ResistanceReport printer = new ResistanceReport();
        printer.printReport(registry.getResistanceEvaluables());


    }
}