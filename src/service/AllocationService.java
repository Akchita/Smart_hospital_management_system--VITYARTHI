
package service;

import exception.ResourceNotAvailableException;
import model.HospitalResource;
import model.Patient;

import java.util.Comparator;
import java.util.PriorityQueue;

public class AllocationService {

    private PriorityQueue<Patient> waitingPatients;

    public AllocationService() {

        waitingPatients = new PriorityQueue<>(
                Comparator.comparingInt(this::getPriorityValue)
        );
    }

    private int getPriorityValue(Patient patient) {

        String level = patient.getEmergencyLevel().toUpperCase();

        switch (level) {

            case "CRITICAL":
                return 1;

            case "HIGH":
                return 2;

            case "MEDIUM":
                return 3;

            case "LOW":
                return 4;

            default:
                return 5;
        }
    }

    public void allocateResource(
            Patient patient,
            ResourceService resourceService) {

        for (HospitalResource resource :
                resourceService.getAllResources()) {

            if (resource.isAvailable()
                    && resource.getResourceType()
                    .equalsIgnoreCase(patient.getRequiredResource())) {

                resource.setAvailable(false);
                patient.setStatus("ALLOCATED");

                System.out.println(
                        "Resource ID "
                                + resource.getResourceId()
                                + " allocated to "
                                + patient.getName()
                );

                return;
            }
        }

        patient.setStatus("WAITING");
        waitingPatients.add(patient);

        throw new ResourceNotAvailableException(
                "No suitable resource is currently available for "
                        + patient.getName()
                        + ". Patient has been added to the priority queue."
        );
    }

    public void displayWaitingPatients() {

        if (waitingPatients.isEmpty()) {

            System.out.println(
                    "No patients are currently waiting."
            );

            return;
        }

        System.out.println("\n--- Waiting Patients ---");

        for (Patient patient : waitingPatients) {
            System.out.println(patient);
        }
    }
}

