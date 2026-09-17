import exception.PatientNotFoundException;
import exception.ResourceNotAvailableException;

import model.Bed;
import model.EmergencyRoom;
import model.Patient;

import service.AllocationService;
import service.AnalyticsService;
import service.PatientService;
import service.ResourceService;

import util.InputValidator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PatientService patientService = new PatientService();
        ResourceService resourceService = new ResourceService();
        AllocationService allocationService = new AllocationService();
        AnalyticsService analyticsService = new AnalyticsService();

        // Add sample hospital resources
        resourceService.addResource(new Bed(101, "ICU"));
        resourceService.addResource(new Bed(102, "GENERAL"));
        resourceService.addResource(new Bed(103, "ICU"));

        resourceService.addResource(
                new EmergencyRoom(201, 1)
        );

        System.out.println("\n========================================");
        System.out.println("     SMART HOSPITAL RESOURCE SYSTEM");
        System.out.println("========================================");

        boolean running = true;

        while (running) {

            System.out.println("\n----------- MAIN MENU -----------");
            System.out.println("1. Register Patient");
            System.out.println("2. View Patients");
            System.out.println("3. View All Resources");
            System.out.println("4. View Available Resources");
            System.out.println("5. Allocate Resource");
            System.out.println("6. View Waiting Patients");
            System.out.println("7. View Hospital Analytics");
            System.out.println("8. Exit");

            int choice = InputValidator.readInt(
                    scanner,
                    "Enter your choice: "
            );

            switch (choice) {

                case 1:

                    int id = InputValidator.readInt(
                            scanner,
                            "Enter Patient ID: "
                    );

                    String name = InputValidator.readNonEmptyString(
                            scanner,
                            "Enter Patient Name: "
                    );

                    int age = InputValidator.readInt(
                            scanner,
                            "Enter Age: "
                    );

                    String level = InputValidator.readNonEmptyString(
                            scanner,
                            "Enter Emergency Level (CRITICAL/HIGH/MEDIUM/LOW): "
                    );

                    String resource = InputValidator.readNonEmptyString(
                            scanner,
                            "Enter Required Resource (BED/EMERGENCY_ROOM): "
                    );

                    Patient patient = new Patient(
                            id,
                            name,
                            age,
                            level,
                            resource
                    );

                    patientService.addPatient(patient);

                    break;

                case 2:

                    patientService.displayAllPatients();

                    break;

                case 3:

                    resourceService.displayAllResources();

                    break;

                case 4:

                    resourceService.displayAvailableResources();

                    break;

                case 5:

                    int patientId = InputValidator.readInt(
                            scanner,
                            "Enter Patient ID for allocation: "
                    );

                    try {

                        Patient patientToAllocate =
                                patientService.findPatientById(patientId);

                        allocationService.allocateResource(
                                patientToAllocate,
                                resourceService
                        );

                    } catch (PatientNotFoundException e) {

                        System.out.println(
                                "Error: " + e.getMessage()
                        );

                    } catch (ResourceNotAvailableException e) {

                        System.out.println(
                                "Resource Unavailable: " + e.getMessage()
                        );
                    }

                    break;

                case 6:

                    allocationService.displayWaitingPatients();

                    break;

                case 7:

                    analyticsService.displayPatientStatistics(
                            patientService.getAllPatients()
                    );

                    break;

                case 8:

                    running = false;

                    System.out.println(
                            "\nThank you for using Smart Hospital Resource System."
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice. Please enter a number from 1 to 8."
                    );
            }
        }

        scanner.close();
    }
}

