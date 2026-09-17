package model;

public class HospitalResource {

    private int resourceId;
    private String resourceType;
    private boolean available;

    public HospitalResource(int resourceId, String resourceType) {
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.available = true;
    }

    public int getResourceId() {
        return resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Resource ID: " + resourceId +
                ", Type: " + resourceType +
                ", Available: " + available;
    }
}