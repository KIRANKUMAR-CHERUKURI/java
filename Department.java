public class Department {
    String deptName;
    String hodName;
    
    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
    }
    
    public void printDeptDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("HOD Name: " + hodName);
    }
}

public class StaffMember extends Department {
    String staffName;
    String staffQualification;
    
    public StaffMember(String deptName, String hodName, String staffName, String staffQualification) {
        super(deptName, hodName);
        this.staffName = staffName;
        this.staffQualification = staffQualification;
    }
    
    public void printStaffDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("HOD Name: " + hodName);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Qualification: " + staffQualification);
    }
}

public class Main {
    public static void main(String[] args) {
        StaffMember staff = new StaffMember("Computer Science", "John Doe", "Jane Smith", "Masters in Computer Science");
        staff.printStaffDetails();
    }
}
