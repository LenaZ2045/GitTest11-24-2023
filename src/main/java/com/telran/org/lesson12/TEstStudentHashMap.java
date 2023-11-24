package com.telran.org.lesson12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TEstStudentHashMap {
    public static void main(String[] args) {
        Map<Student, List<Course>> studentCourseMap = new HashMap<>(); // very fast dostyp to Hash

        Student alex = new Student("Alex", "Alekseev");
        Student maxim = new Student("Maxim", "Maximov");

        Course java = new Course("Java", 105);
        Course sql = new Course("SQL", 30);
        Course algo = new Course("Algo", 30);

        List<Course> alexCourses = List.of(java, algo);
        List<Course> maximCourses = List.of(sql, algo);

        studentCourseMap.put(alex, alexCourses);
        studentCourseMap.put(maxim, maximCourses);

        printName(studentCourseMap);
        alex.setSurname("Petrov"); // exchanged field for the settled value and it evaluated as NULL
        studentCourseMap.put(alex, alexCourses); // in conclusion never use field to be changed as you will lose this objects
        printName(studentCourseMap);

        System.out.println();

        Student newMaxim = new Student("Maxim", "Maximov");
        if (studentCourseMap.containsKey(newMaxim)) {
            System.out.println("new Maxim exist in hash map"); // String is the better type for HashCode
        }

        List<Course> coursesForNewMaxim = studentCourseMap.get(newMaxim); // ssilka na proshlogo 'Maxim' i poluchili dannie tak kak it is found that it is equals
        System.out.println("courses for new Maxim = " + coursesForNewMaxim);

        Student oleg = new Student("Oleg", "Olegov");

        List<Course> courses = studentCourseMap.get(alex);
        System.out.println("Courses for Alex by key = " + courses);

        if (studentCourseMap.containsKey(oleg)) { // method contains will check the availability of an object
            List<Course> coursesOleg = studentCourseMap.get(oleg);
            System.out.println("Courses for Oleg by key = " + coursesOleg);
            System.out.println("Count of courses for Oleg " + coursesOleg.size());
        }

        StudentWithId studentWithId1 = new StudentWithId("Alex", "Alexeev",1);
        StudentWithId studentWithId2 = new StudentWithId("Alex", "Alexeev",2);


    }

    private static void printName(Map<Student, List<Course>> studentCourseMap) { // method printMap
        studentCourseMap.forEach((student, courseList) -> {
            System.out.println("courses for student" + student.getName() + " "+ student.getSurname());
            courseList.forEach(course -> {
                System.out.println("Course name " + course.getName() + " hours" + course.getHours());
            });
            System.out.println();
        });
    }
}
