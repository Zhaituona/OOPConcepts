package abstraction;

public abstract class OldStudent implements StudentName {
    public int oldStudentID;

    public abstract void getOldStudentAge();

    public int getOldStudentID(){
        return oldStudentID;

    }
}
