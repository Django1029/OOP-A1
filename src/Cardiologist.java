/**
 * Cardiologist.java
 * Child class representing a Cardiologist (Part 2)
 */
public class Cardiologist extends HealthProfessional {
    // Extra variable to differentiate cardiologist
    private String hospitalAffiliation;

    // Default constructor
    public Cardiologist() {
        super();
        this.hospitalAffiliation = "Unknown Hospital";
    }

    // Constructor that initializes base and child variables
    public Cardiologist(int id, String name, String clinicName, String hospitalAffiliation) {
        super(id, name, clinicName);
        this.hospitalAffiliation = hospitalAffiliation;
    }

    public String getHospitalAffiliation() {
        return hospitalAffiliation;
    }

    public void setHospitalAffiliation(String hospitalAffiliation) {
        this.hospitalAffiliation = hospitalAffiliation;
    }

    // Method that prints details including type
    public void printDetails() {
        System.out.println("The health professional details are: (Cardiologist)");
        super.printDetails();
        System.out.println("Hospital Affiliation: " + hospitalAffiliation);
    }

    @Override
    public String toString() {
        return "(Cardiologist) " + super.toString() + ", Hospital: " + hospitalAffiliation;
    }
}
