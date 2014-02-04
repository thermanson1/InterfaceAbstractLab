package lab1;




public class IntroToProgrammingCourse extends CollegeProgrammingCourses {
    
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
    
    


    
}
