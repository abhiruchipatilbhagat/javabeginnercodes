public class Student {
    int roll_no = 10;
    String name = "qbhi";
    boolean pass = true;

    // Constructor to initialize the roll_no and name fields
    public Student(int r, String n) {
        this.roll_no = r;
        this.name = n;
    }

    public static void main(String[] args) {
        // Create instances of Student
        Student abhi = new Student(10, "qbhi"); // You can pass initial values here
        Student bhi2 = new Student(17, "bhi2");

        System.out.println(abhi.roll_no); // Print roll_no of abhi
        System.out.println(bhi2.roll_no); // Print roll_no of bhi2
    }
}
