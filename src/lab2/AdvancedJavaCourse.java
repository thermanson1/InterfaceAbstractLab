package lab2;

import javax.swing.JOptionPane;

public class AdvancedJavaCourse extends IntroJavaCourse {
   private String courseNumber;
   private String courseName;
   private double credits;
   private String prerequisites;

   @Override
    public double getCredits() {
        return credits;
    }
    
    @Override
    public String getCourseName(){
        return courseName;
    }
    
    @Override
    public String getCourseNumber(){
        return courseNumber;
    }
    
    public String getPrerequisites(){
        return prerequisites;
    }
  
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

   
 
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }


    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null, 
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;  
    }

    
}
