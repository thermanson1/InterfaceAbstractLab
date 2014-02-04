

package lab1;

import java.util.Scanner;

public class Startup {
    
    public static void main(String[]args){
        
        CollegeProgrammingCourses course1 = new IntroJavaCourse();
        
        course1.setCredits(4.0);
        course1.setCourseName("Intro to Java");
        course1.setCourseNumber("C543-34");
        
        System.out.println("Course credits: " + course1.getCredits() + "\n" + "Course Name: " + course1.getCourseName() + "\n" + "Course Number: " + course1.getCourseNumber()+ "\n\n");
        
        CollegeProgrammingCourses course = new IntroToProgrammingCourse();
        
        course.setCredits(2.0);
        course.setCourseName("Intro To Programming");
        course.setCourseNumber("C542-45");
        
        System.out.print("Course credits: " + course.getCredits() + "\n" + "Course Name: " + course.getCourseName() + "\n" + "Course Number: " + course.getCourseNumber() + "\n\n");
        
        CollegeProgrammingCourses course2 = new AdvancedJavaCourse();
        
        course2.setCredits(4.0);
        course2.setCourseName("Advanced Java");
        course2.setCourseNumber("C544-56");
        
        System.out.print("Course credits: " + course2.getCredits() + "\n" + "Course Name: " + course2.getCourseName() + "\n" + "Course Number: " + course2.getCourseNumber() +"\n\n");
    }
    
}
