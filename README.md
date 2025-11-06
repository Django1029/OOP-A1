Project Overview

This project implements a simple appointment system for a health service using Java.
It demonstrates core object-oriented programming (OOP) principles including:

Inheritance: using a base class HealthProfessional and two subclasses (GeneralPractitioner and Cardiologist)

Polymorphism: allowing Appointment to work with different types of HealthProfessional

Encapsulation: private fields with getters and setters

Collections: using ArrayList to manage multiple Appointment objects

This project addresses:
ULO1: Explain, compare, and apply advanced class design concepts.
ULO2: Apply object-oriented programming principles to solve intermediate problems.
How to Compile and Run

Open a terminal and go to the src directory:
cd yourSCUusername-A1/src

Compile all Java files:
javac *.java

Run the program:
java AssignmentOne

Expected output includes:

Part 3: Details of three General Practitioners and two Cardiologists.

Part 5: Appointments created, printed, one cancelled, and updated list shown.

Class Summary

HealthProfessional – Base class with ID, name, and clinic name.
GeneralPractitioner – Subclass adding bulk-billing information.
Cardiologist – Subclass adding hospital affiliation.
Appointment – Stores patient details, time slot, and doctor (polymorphic).
AssignmentOne – Main class demonstrating all features (Part 3 and Part 5).

Example Output

// Part 3 – Using classes and objects
The health professional details are: (General Practitioner)
ID: 101
Name: Dr. Alice Morgan
Clinic: Riverside Clinic
Bulk Billing: Yes
The health professional details are: (Cardiologist)
ID: 201
Name: Dr. David Wang
Clinic: HeartCare Clinic
Hospital Affiliation: St. Mary's Hospital
// Part 5 – Collection of appointments
Appointment created successfully for Michael Brown at 09:00 with Dr. Alice Morgan
Appointment created successfully for Sarah Green at 10:30 with Dr. Ben Carter
Appointment created successfully for Peter Black at 11:00 with Dr. David Wang
Appointment created successfully for Linda White at 14:30 with Dr. Emma Patel
Existing appointments (4):
Appointment:
Patient Name: Michael Brown
Mobile Phone: 0412345678
Time Slot: 09:00
Doctor: (GP) ID: 101, Name: Dr. Alice Morgan, Clinic: Riverside Clinic, BulkBilling: Yes
Appointment for mobile 0434567890 has been cancelled.
Existing appointments (3):# OOP-A1
