package Guia_09_HER.Ejercicio_Extra_04;

public class Student extends Person{
    private String enrolledCourse;

    public Student() {
    }
    
    public Student(String enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }

    public Student(String enrolledCourse, String name, String Surname, Long ID, String CivilStatus) {
        super(name, Surname, ID, CivilStatus);
        this.enrolledCourse = enrolledCourse;
    }

    public String getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(String enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }
    
}
