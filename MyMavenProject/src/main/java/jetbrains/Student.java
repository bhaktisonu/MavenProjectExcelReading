package jetbrains;

public class Student {
public   double   RollNo ;
   public String StudentName;
  public    double sClass;
    public String  UserName;
    public String Password;

    public String getPassword() {
        return Password;
    }

    public double getRollNo() {
        return RollNo;
    }

    public String getStudentName() {
        return StudentName;
    }

    public double getsClass() {
        return sClass;
    }

    public String getUserName() {
        return UserName;
    }

    public void setRollNo(double rollNo) {
        RollNo = rollNo;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }


    public void setsClass(double sClass) {
        this.sClass = sClass;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
