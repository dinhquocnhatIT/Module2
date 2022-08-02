package demo_employee.entity;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {
    private String expInYear;
    private String proSkill;
    public Experience(){

    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public Experience(String expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificates, String expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(String expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience: \n" +
                "  Id :   " + id + '\'' +
                "  Full Name:   " + fullName + '\n' +
                "  Birth Day:   " + birthDay + '\n' +
                "  Phone:   " + phone + '\n' +
                "  Email:   " + email + '\n' +
                "  Certificates:   " + certificates + '\n' +
                "  Exp In Year:    " + expInYear + '\n' +
                "  Pro Skill:   " + proSkill;
    }
}
