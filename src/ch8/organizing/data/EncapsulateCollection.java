package ch8.organizing.data;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EncapsulateCollection {

    public static void main(String[] args) {
        Person kent = new Person();
        kent.addCourse(new Course("Scala Programming", false));
        kent.addCourse(new Course("Software Architecture", true));

//        kent.getCourses().add(new Course("Refactoring", true));
        kent.addCourse(new Course("Refactoring", true));

        int count = 0;
        Iterator<Course> itr = kent.getCourses().iterator();
        while (itr.hasNext()) {
            Course course = itr.next();
            if(course.isAdvanced()) {
                count ++;
            }
        }
        System.out.println(count);
    }
}

class Course {
    private String name;
    private boolean advanced;

    public Course(String name, boolean advanced) {
        this.name = name;
        this.advanced = advanced;
    }

    public boolean isAdvanced() {
        return advanced;
    }

    public String getName() {
        return name;
    }
}

class Person {
    private Set<Course> courses;

    public Person() {
        courses = new HashSet<Course>();
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void setCourses(Set<Course> courses) {
        Iterator<Course> itr = courses.iterator();
        while (itr.hasNext()) {
            addCourse(itr.next());
        }
    }
}