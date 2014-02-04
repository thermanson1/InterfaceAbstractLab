

package lab2;


public class Startup {
    
    public static void main(String[]args){
        
        IntroToProgrammingCourse course = new IntroToProgrammingCourse();
        
        course.setCourseName("Intro to Programming");
        course.setCredits(2.0);
        course.setCourseNumber("C567-23");
        
        IntroJavaCourse course1 = new IntroJavaCourse();
        
        course1.setCourseName("Intro to Java");
        course1.setCredits(4.0);
        course1.setCourseNumber("C567-34");
        
        AdvancedJavaCourse course2 = new AdvancedJavaCourse();
        
        course2.setCourseName("Advanced Java");
        course2.setCredits(4.0);
        course2.setCourseNumber("C567-45");
        
        System.out.print("Course Name: " + course.getCourseName() + "\n" + "Course Credits: " + course.getCredits() + "\n" + "Course Number: " + course.getCourseNumber() + "\n\n");
        System.out.print("Course Name: " + course1.getCourseName() + "\n" + "Course Credits: " + course1.getCredits() + "\n" + "Course Number: " + course1.getCourseNumber() + "\n\n");
        System.out.print("Course Name: " + course2.getCourseName() + "\n" + "Course Credits: " + course2.getCredits() + "\n" + "Course Number: " + course2.getCourseNumber() + "\n\n");
    }
    
}
