package Example1;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        CourseCollection courseCollection = new CourseCollection();
        courseCollection.addCourse(new Course("Introduction to Java", "CS101"));
        courseCollection.addCourse(new Course("Data Structure", "CS201"));
        courseCollection.addCourse(new Course("Operating Systems", "CS301"));

        System.out.println("Available courses:");
        for (CourseCollection it = courseCollection; it.hasNext(); ) {
            Course course = it.next();
            System.out.println(course);
        }
    }
}
