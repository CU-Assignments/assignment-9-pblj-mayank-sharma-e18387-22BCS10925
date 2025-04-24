public class Student {
       String name;
       Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course.getCourseName() + ", Duration: " + course.getDuration() + " months");
    }
}
