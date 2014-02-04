package lab1;

import javax.swing.JOptionPane;

public class IntroJavaCourse extends CollegeProgrammingCourses{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    @Override
    public String getCourseName(){
        return courseName;
    }
    @Override 
    public String getCourseNumber(){
        return courseNumber;
    }
    @Override
    public double getCredits(){
        return credits;
    }
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

   

}
