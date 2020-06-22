package demo_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
//        creat list student
        List<Student> listStudents = new ArrayList<Student>();
//        add student to list
        listStudents.add(new Student("Binh", 20));
        listStudents.add(new Student("Diep", 25));
        listStudents.add(new Student("Lan", 27));
        listStudents.add(new Student("Phuong", 25));
        listStudents.add(new Student("Quynh", 24));
        listStudents.add(new Student("Loan", 20));

//        sort lis studen by it's age
        System.out.println("Sort list student by it's age: ");
        Collections.sort(listStudents, new StudentCompare());
        for (Student student : listStudents) {
            System.out.println(student + "\t");
        }
//        Collections.sort(listStudents,
//                Comparator.comparing(Student::getAge).thenComparing(Student::getName));
//        listStudents.stream().forEach(System.out::println);
    }
}