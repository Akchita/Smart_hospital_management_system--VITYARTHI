package model;

public class Patient {

    private int patientId;
    private String name;
    private int age;
    private String emergencyLevel;
    private String requiredResource;
    private String status;

    public Patient(int patientId, String name, int age,
                   String emergencyLevel, String requiredResource) {

        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.emergencyLevel = emergencyLevel;
        this.requiredResource = requiredResource;
        this.status = "WAITING";
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmergencyLevel() {
        return emergencyLevel;
    }

    public String getRequiredResource() {
        return requiredResource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
                ", Name: " + name +
                ", Age: " + age +
                ", Emergency Level: " + emergencyLevel +
                ", Required Resource: " + requiredResource +
                ", Status: " + status;
    }
}