package Example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseCollection implements Iterator<Course>{
    private List<Course> courses = new ArrayList<>();
    private int currentIndex = 0;

    public void addCourse(Course course) {
        courses.add(course);
    }
    @Override
    public boolean hasNext() {
        return currentIndex <courses.size();
    }

    @Override
    public Course next() {
        return courses.get(currentIndex++);
    }
}
