package demo_employee.entity;

import java.time.LocalDate;
import java.util.List;

public abstract class Employee {
    protected static long employeeCount = 0;
    protected String id;
    protected String fullName;
    protected LocalDate birthDay;
    protected  String phone;
    protected String email;
    protected List<Certificate> certificates;

    public Employee(){

    }

    public Employee(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificates) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }
    public abstract void showInfo();

    public static long getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(long employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
}
