package service;

import model.HospitalResource;

import java.util.ArrayList;
import java.util.List;

public class ResourceService {

    private List<HospitalResource> resources;

    public ResourceService() {
        resources = new ArrayList<>();
    }

    public void addResource(HospitalResource resource) {
        resources.add(resource);
        System.out.println("Resource added successfully.");
    }

    public HospitalResource findResourceById(int resourceId) {

        for (HospitalResource resource : resources) {
            if (resource.getResourceId() == resourceId) {
                return resource;
            }
        }

        return null;
    }

    public void displayAllResources() {

        if (resources.isEmpty()) {
            System.out.println("No resources available.");
            return;
        }

        System.out.println("\n--- Hospital Resources ---");

        for (HospitalResource resource : resources) {
            System.out.println(resource);
        }
    }

    public void displayAvailableResources() {

        boolean resourceFound = false;

        System.out.println("\n--- Available Resources ---");

        for (HospitalResource resource : resources) {
            if (resource.isAvailable()) {
                System.out.println(resource);
                resourceFound = true;
            }
        }

        if (!resourceFound) {
            System.out.println("No resources are currently available.");
        }
    }
    public List<HospitalResource> getAllResources() {
    return resources;
    }
}
