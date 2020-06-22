package demo_comparator;

import java.util.Comparator;

public class StudentCompare implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()!= o2.getAge()){
            return o1.getAge() > o2.getAge() ? 1 : -1;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
