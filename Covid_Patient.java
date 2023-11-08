package assignments;
import java.util.*;

class Covid_Patient {
    private String name;
    private int id;
    private String dateOfBirth;
    private String bloodGroup;
    private String testReport;
    private String contactAddress;
    private int phoneNumber;
    private int aadharNumber;

    // Default Constructor
    public Covid_Patient() {
        this.name = "";
        this.id = 0;
        this.dateOfBirth = "";
        this.bloodGroup = "";
        this.testReport = "";
        this.contactAddress = "";
        this.phoneNumber = 0;
        this.aadharNumber = 0;
    }

    // Constructor Overloading - 1
    public Covid_Patient(String name, int id, String dateOfBirth, String bloodGroup) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.testReport = "";
        this.contactAddress = "";
        this.phoneNumber = 0;
        this.aadharNumber = 0;
    }

    // Constructor Overloading - 2
    public Covid_Patient(String name, int id, String dateOfBirth, String bloodGroup, String testReport,
                        String contactAddress, int phoneNumber, int aadharNumber) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.testReport = testReport;
        this.contactAddress = contactAddress;
        this.phoneNumber = phoneNumber;
        this.aadharNumber = aadharNumber;
    }

    // Getters and Setters for the class variables
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getTestReport() {
        return testReport;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAadharNumber() {
        return aadharNumber;
    }

    public void setTestReport(String testReport) {
        this.testReport = testReport;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAadharNumber(int aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    // Method to display patient information
    public void displayPatientInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Test Report: " + testReport);
        System.out.println("Contact Address: " + contactAddress);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Aadhar Number: " + aadharNumber);
    }

    public static void main(String[] args) {
        // Create instances of CovidPatient using different constructors
    	Scanner sc  =new Scanner(System.in);
   
        Covid_Patient patient1 = new Covid_Patient("Raj", 1, "16-1-1991", "O+");
        Covid_Patient patient2 = new Covid_Patient("Mahesh", 2, "23-6-2001", "AB+", "Negative", "New York City", 12222321, 124578963);

        // Display patient information
        System.out.println("Patient 1 Information:");
        patient1.displayPatientInfo();

        System.out.println("\nPatient 2 Information:");
        patient2.displayPatientInfo();
    }
}
