
package service;

import exception.PatientNotFoundException;
import model.Patient;

import java.util.ArrayList;
import java.util.List;

public class PatientService {

    private List<Patient> patients;

    public PatientService() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    public Patient findPatientById(int patientId) {

        for (Patient patient : patients) {

            if (patient.getPatientId() == patientId) {
                return patient;
            }
        }

        throw new PatientNotFoundException(
                "Patient with ID " + patientId + " was not found."
        );
    }

    public void displayAllPatients() {

        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
            return;
        }

        System.out.println("\n--- Patient List ---");

        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public List<Patient> getAllPatients() {
        return patients;
    }
}

