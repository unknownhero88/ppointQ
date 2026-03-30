package Day02.SimpleStudentClass;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 101, 75);
        s1.display();

        Topper t1 = new Topper("Sneha", 102, 95);
        t1.display();
        System.out.println(t1.getScholarship());
    }
}