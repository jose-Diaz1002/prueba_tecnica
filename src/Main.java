import domain.ResistanceReport;
import models.AirRobot;
import models.GroundRobot;
import models.WaterRobot;
import models.enums.PropulsionSystem;
import models.enums.TractionType;
import service.RobotRegistry;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        RobotRegistry registry = new RobotRegistry();

        // Register robots
        registry.register(new GroundRobot("Glitch", "Proto", 2022, LocalDate.now(), 50, TractionType.ORUGAS));
        registry.register(new GroundRobot("Clank", "BioCorp", 2020, LocalDate.now(), 70, TractionType.ORUGAS ));
        registry.register(new GroundRobot("Kernel", "ZeroCool ", 2000, LocalDate.now(), 70, TractionType.RUEDAS ));
        registry.register(new WaterRobot("AquaNova", "Nanotech", 2010, LocalDate.now(), 89, PropulsionSystem.CHORRO));
        registry.register(new WaterRobot("Vector", "Iris", 2007, LocalDate.now(), 8000, PropulsionSystem.HELICE));
        registry.register(new AirRobot("Polaris", "AeroDynamics", 2003, LocalDate.now(), 3000, 75));
        registry.register(new AirRobot("DroneGuard", "Aeroprototype", 2025, LocalDate.now(), 2500, 45));

        // 1. List all
        System.out.println("=== All Registered Robots ===");
        registry.listAll().forEach(r -> System.out.println(r.getTechnicalDescription()));

        // 2. Filter ground robots with speed > 60
        System.out.println("\n=== Ground Robots with Speed > 60 km/h ===");
        registry.filterGroundRobotsBySpeed(60).forEach(r -> System.out.println(r.getTechnicalDescription()));

        // 3. Search by manufacturer
        System.out.println("\n=== Robots by Manufacturer: AeroDynamics ===");
        registry.searchByManufacturer("AeroDynamics").forEach(r -> System.out.println(r.getTechnicalDescription()));

        // 4. Resistance competition report
        //System.out.println("\n=== Resistance Competition Report ===");
        ResistanceReport printer = new ResistanceReport();
        printer.printReport(registry.getResistanceEvaluables());


    }
}