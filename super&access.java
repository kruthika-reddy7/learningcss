class Person {
    protected String name = "John";

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String name = "Alice";

    void showNames() {
        System.out.println("Child name: " + name);
        System.out.println("Parent name: " + super.name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.showNames();
    }
}