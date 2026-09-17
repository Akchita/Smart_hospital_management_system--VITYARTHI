package service;

import model.Patient;

import java.util.List;

public class AnalyticsService {

    public void displayPatientStatistics(List<Patient> patients) {

        int total = patients.size();
        int critical = 0;
        int high = 0;
        int medium = 0;
        int low = 0;
        int allocated = 0;
        int waiting = 0;

        for (Patient patient : patients) {

            String level = patient.getEmergencyLevel().toUpperCase();

            switch (level) {
                case "CRITICAL":
                    critical++;
                    break;

                case "HIGH":
                    high++;
                    break;

                case "MEDIUM":
                    medium++;
                    break;

                case "LOW":
                    low++;
                    break;
            }

            if (patient.getStatus().equalsIgnoreCase("ALLOCATED")) {
                allocated++;
            } else if (patient.getStatus().equalsIgnoreCase("WAITING")) {
                waiting++;
            }
        }

        System.out.println("\n--- Hospital Statistics ---");
        System.out.println("Total Patients: " + total);
        System.out.println("Critical Patients: " + critical);
        System.out.println("High Priority Patients: " + high);
        System.out.println("Medium Priority Patients: " + medium);
        System.out.println("Low Priority Patients: " + low);
        System.out.println("Allocated Patients: " + allocated);
        System.out.println("Waiting Patients: " + waiting);
    }
}