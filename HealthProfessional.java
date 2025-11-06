/**
 * HealthProfessional.java
 * Base class for health professionals (Part 1)
 */
public class HealthProfessional {
    // Required instance variables
    private int id;           // numbers only
    private String name;
    // Another instance variable relevant regardless of doctor type
    private String clinicName;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.clinicName = "Unknown Clinic";
    }

    // Constructor that initializes all instance variables
    public HealthProfessional(int id, String name, String clinicName) {
        this.id = id;
        this.name = name;
        this.clinicName = clinicName;
    }

    // Getters and setters (encapsulation)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    // Method that prints all instance variables
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Clinic: " + clinicName);
    }

    // Provide a toString override for convenience
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Clinic: " + clinicName;
    }
}
