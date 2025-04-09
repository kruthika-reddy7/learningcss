class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 30000.0;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing HR tasks");
    }

    void addEmployee() {
        System.out.println("New employee added");
    }

    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}