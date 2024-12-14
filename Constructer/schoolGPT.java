public class schoolGPT {
    // Private attributes
    private String schoolName;
    private String address;
    private int establishedYear;
    private int numberOfStudents;
    private String principalName;
    private boolean isPrivate;
    private boolean hasLibrary;
    private boolean hasPlayground;

    // Constructor with essential parameters
    public schoolGPT(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
        this.numberOfStudents = 0;  // Default value
    }

    // Constructor with all parameters
    public schoolGPT(String schoolName, String address, int establishedYear, 
                 String principalName, boolean isPrivate) {
        this.schoolName = schoolName;
        this.address = address; 
        this.establishedYear = establishedYear;
        this.principalName = principalName;
        this.isPrivate = isPrivate;
        this.numberOfStudents = 0;
    }

    // Getters and Setters
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getPrincipalName() {
        return principalName;
    }

    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    // Utility methods
    public void addStudents(int count) {
        if (count > 0) {
            this.numberOfStudents += count;
        }
    }

    public void removeStudents(int count) {
        if (count > 0 && count <= this.numberOfStudents) {
            this.numberOfStudents -= count;
        }
    }

    public void setFacilities(boolean hasLibrary, boolean hasPlayground) {
        this.hasLibrary = hasLibrary;
        this.hasPlayground = hasPlayground;
    }

    // Display school information
    public void displaySchoolInfo() {
        System.out.println("School Information:");
        System.out.println("Name: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Principal: " + principalName);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Type: " + (isPrivate ? "Private" : "Public"));
        System.out.println("Facilities:");
        System.out.println("- Library: " + (hasLibrary ? "Yes" : "No"));
        System.out.println("- Playground: " + (hasPlayground ? "Yes" : "No"));
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating school object with minimal constructor
        schoolGPT school1 = new schoolGPT("ABC School", "123 Education Street");
        school1.setEstablishedYear(1990);
        school1.setPrincipalName("Mr. Johnson");
        school1.setFacilities(true, true);
        school1.addStudents(500);
        school1.displaySchoolInfo();

        System.out.println("\n-------------------\n");

        // Creating school object with full constructor
        schoolGPT school2 = new schoolGPT("XYZ Academy", "456 Learning Avenue", 
                                  2000, "Mrs. Smith", true);
        school2.setFacilities(true, false);
        school2.addStudents(300);
        school2.displaySchoolInfo();
    }
}
