package ch8.organizing.data;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EncapsulateCollection {

    public static void main(String[] args) {
        Person kent = new Person();
        Set<Course> set = new HashSet<Course>();
        set.add(new Course("Scala Programming", false));
        set.add(new Course("Software Architecture", true));
        kent.setCourses(set);

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

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}