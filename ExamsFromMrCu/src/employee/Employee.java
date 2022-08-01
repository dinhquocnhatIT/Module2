package employee;

import java.time.LocalDate;

public abstract class Employee {
    private String id;
    private String fullName;
    private LocalDate birthDay;

    private String phone;
    private String email;
    private  String employee_type;
    private int employee_count = 0;

    public abstract void showInfo();
    Employee() {

    }

    public Employee(String id, String fullName, LocalDate birthDay, String phone, String email, String employee_type, int employee_count) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.employee_count = employee_count;
    }

    public String getID() {

        return id;
    }

    public void setID(String id) {

        this. id= id;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {

        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {

        this.birthDay = birthDay;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getEmployee_type() {

        return employee_type;
    }

    public void setEmployee_type(String employee_type) {

        this.employee_type = employee_type;
    }

    public int getEmployee_count() {

        return employee_count;
    }

    public void setEmployee_count(int employee_count) {

        this.employee_count = employee_count;
    }

    @Override
    public String toString() {
        return
                "\n  ID  :  " + id +
                "\n  Full Name : '" + fullName + '\'' +
                "\n  Birth Day : " + birthDay +
                "\n  Phone :  '" + phone + '\'' +
                "\n  Email  :  '" + email + '\'' +
                "\n  Employee_type :  '" + employee_type + '\'' +
                "\n  Employee_count  :  " + employee_count;
    }
}
