/**
 * GeneralPractitioner.java
 * Child class representing a GP (Part 2)
 */
public class GeneralPractitioner extends HealthProfessional {
    // Extra variable to differentiate a GP
    private boolean bulkBilling; // whether GP bulk-bills

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.bulkBilling = false;
    }

    // Constructor that initializes base and child variables
    public GeneralPractitioner(int id, String name, String clinicName, boolean bulkBilling) {
        super(id, name, clinicName);
        this.bulkBilling = bulkBilling;
    }

    public boolean isBulkBilling() {
        return bulkBilling;
    }

    public void setBulkBilling(boolean bulkBilling) {
        this.bulkBilling = bulkBilling;
    }

    // Method that prints details including type
    public void printDetails() {
        System.out.println("The health professional details are: (General Practitioner)");
        super.printDetails();
        System.out.println("Bulk Billing: " + (bulkBilling ? "Yes" : "No"));
    }

    @Override
    public String toString() {
        return "(GP) " + super.toString() + ", BulkBilling: " + (bulkBilling ? "Yes" : "No");
    }
}
