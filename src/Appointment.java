/**
 * Appointment.java
 * Represents an appointment (Part 4)
 */
public class Appointment {
    private String patientName;
    private String mobilePhone;   // store as String to preserve leading zeros, but validate content
    private String timeSlot;      // e.g., "08:00"
    private HealthProfessional doctor; // can hold any subclass (polymorphism)

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = new HealthProfessional(); // placeholder
    }

    // Constructor that initializes all instance variables
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Getters
    public String getPatientName() {
        return patientName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    // Method that prints all instance variables
    public void printDetails() {
        System.out.println("Appointment:");
        System.out.println("  Patient Name: " + patientName);
        System.out.println("  Mobile Phone: " + mobilePhone);
        System.out.println("  Time Slot: " + timeSlot);
        System.out.println("  Doctor: " + doctor.toString());
    }

    @Override
    public String toString() {
        return "Appointment[Patient=" + patientName + ", Mobile=" + mobilePhone + ", Time=" + timeSlot + ", Doctor=" + doctor.toString() + "]";
    }
}
