package abstraction;

public abstract class Admin implements AssistantName, TeacherName{

    public int adminID;

    public abstract void getAdminAge();

    public int getAdminID() {
        return adminID;

    }
}