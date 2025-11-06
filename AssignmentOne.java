import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * AssignmentOne.java
 * Main class demonstrating Parts 3 and 5 for the assignment
 *
 * NOTE: The assessment brief requires you to include a GenAI use declaration in your
 * final submission comments. Add that statement to Blackboard when you submit.
 */
public class AssignmentOne {

    // Part 5 helper methods are static so main can call them directly.

    /**
     * createAppointment - creates and adds an appointment to the list.
     * Validates required fields: patientName, mobilePhone (digits only), timeSlot, doctor (non-null)
     *
     * Demonstrates polymorphism: doctor param is typed as HealthProfessional but can be any subclass
     */
    public static boolean createAppointment(List<Appointment> list, String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        if (patientName == null || patientName.trim().isEmpty()) {
            System.out.println("Error: Patient name is required. Appointment not created.");
            return false;
        }
        if (mobilePhone == null || !mobilePhone.matches("\\d{8,15}")) { // basic validation: digits, length 8-15
            System.out.println("Error: Mobile phone is required and must be digits (8-15). Appointment not created.");
            return false;
        }
        if (timeSlot == null || !timeSlot.matches("\\d{2}:\\d{2}")) { // basic HH:MM format check
            System.out.println("Error: Time slot is required in HH:MM format. Appointment not created.");
            return false;
        }
        if (doctor == null) {
            System.out.println("Error: Doctor selection is required. Appointment not created.");
            return false;
        }

        Appointment appt = new Appointment(patientName.trim(), mobilePhone.trim(), timeSlot.trim(), doctor);
        list.add(appt);
        System.out.println("Appointment created successfully for " + patientName + " at " + timeSlot + " with " + doctor.getName());
        return true;
    }

    /**
     * printExistingAppointments - prints all appointments or a message if none exist.
     */
    public static void printExistingAppointments(List<Appointment> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        System.out.println("Existing appointments (" + list.size() + "):");
        for (Appointment a : list) {
            a.printDetails();
            System.out.println("------------------------------");
        }
    }

    /**
     * cancelBooking - cancels the first appointment found with the given mobile phone.
     * If not found, prints a message.
     */
    public static boolean cancelBooking(List<Appointment> list, String mobilePhone) {
        if (list == null || list.isEmpty()) {
            System.out.println("No appointments to cancel.");
            return false;
        }
        Iterator<Appointment> it = list.iterator();
        while (it.hasNext()) {
            Appointment a = it.next();
            if (a.getMobilePhone().equals(mobilePhone)) {
                it.remove();
                System.out.println("Appointment for mobile " + mobilePhone + " has been cancelled.");
                return true;
            }
        }
        System.out.println("No appointment found with mobile phone: " + mobilePhone);
        return false;
    }

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // Create three GeneralPractitioner objects and two Cardiologist objects, then print their details.
        System.out.println("// Part 3 – Using classes and objects");

        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice Morgan", "Riverside Clinic", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Ben Carter", "Northside Clinic", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Chloe Li", "Central Health", true);

        Cardiologist c1 = new Cardiologist(201, "Dr. David Wang", "HeartCare Clinic", "St. Mary's Hospital");
        Cardiologist c2 = new Cardiologist(202, "Dr. Emma Patel", "CardioPlus", "Kingston General Hospital");

        // Use methods to print details (includes base class info)
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");
        c1.printDetails();
        System.out.println("------------------------------");
        c2.printDetails();

        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");

        ArrayList<Appointment> appointments = new ArrayList<>();

        // Make 2 appointments with general practitioners.
        createAppointment(appointments, "Michael Brown", "0412345678", "09:00", gp1);
        createAppointment(appointments, "Sarah Green", "0423456789", "10:30", gp2);

        // Make another 2 appointments with the other type of health professional (Cardiologist).
        createAppointment(appointments, "Peter Black", "0434567890", "11:00", c1);
        createAppointment(appointments, "Linda White", "0445678901", "14:30", c2);

        // Print existing appointments.
        System.out.println();
        printExistingAppointments(appointments);

        // Cancel one of the existing appointments.
        System.out.println();
        cancelBooking(appointments, "0434567890"); // cancel Peter Black's appointment

        // Print again existing appointments to demonstrate the updated collection.
        System.out.println();
        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }
}
