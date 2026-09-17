package model;

public class Bed extends HospitalResource {

    private String bedType;

    public Bed(int resourceId, String bedType) {
        super(resourceId, "BED");
        this.bedType = bedType;
    }

    public String getBedType() {
        return bedType;
    }

    @Override
    public String toString() {
        return "Bed ID: " + getResourceId() +
                ", Bed Type: " + bedType +
                ", Available: " + isAvailable();
    }
}