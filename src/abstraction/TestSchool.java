package abstraction;

public class TestSchool {
    public static void main(String[] args) {
    	
    	Student st1 = new Student();
    	st1.getStudentID(1234);
    	st1.getStudentName("zaytuan");
    	
    	Assistant at1 = new Assistant();
    	at1.getTeacherFirstName();
    	at1.getTeacherLastName();
    	
        TeacherName tc1 = new Assistant();
        tc1.getTeacherFirstName();
        tc1.getTeacherLastName();
        
        TeacherName tc2 = new Assistant();
        tc2.getTeacherFirstName();
        tc2.getTeacherLastName();
        
        School sh1 = new School();
        sh1.getOldStudentID();
        
        StudentName st3 = new School();
        st3.getStudentFirstName();
        st3.getStudentLastName();
        
        NewStudent nw1 = new NewStudent();
        nw1.getNewStudentAge();
        nw1.getStudentID(1235);

    }
}
