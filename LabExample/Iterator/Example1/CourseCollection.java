package Example1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseCollection implements Iterable<Course>{
    private List<Course> courses = new ArrayList<>();


    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new CourseIterator();
    }
    private class CourseIterator implements Iterator<Course> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex <courses.size();
        }

        @Override
        public Course next() {
            return courses.get(currentIndex++);
        }

    }
}
