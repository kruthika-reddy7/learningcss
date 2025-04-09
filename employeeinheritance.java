class Employee {
    String name;
    int empId;

    void getDetails(String name, int id) {
        this.name = name;
        this.empId = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + empId);
    }
}

class Manager extends Employee {
    String department;

    void setDepartment(String dept) {
        department = dept;
    }

    void displayManagerDetails() {
        displayDetails();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.getDetails("Ravi", 101);
        m.setDepartment("IT");
        m.displayManagerDetails();
    }
}