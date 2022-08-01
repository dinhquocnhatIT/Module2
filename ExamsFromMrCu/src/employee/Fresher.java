package employee;

import java.time.LocalDate;

public class Fresher extends Employee{
    private LocalDate graduation_date;
    private  String graduation_rank;
    private  String education;
    Fresher()  {};
    Fresher(LocalDate graduation_date, String graduation_rank, String education) {
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }


    public Fresher(String id, String fullName, LocalDate birthDay, String phone, String email, String employee_type, int employee_count, LocalDate graduation_date, String graduation_rank, String education) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public LocalDate getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(LocalDate graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fresher Employee --------" +
                super.toString() +
                "\n  Graduation_date  :  " + graduation_date +
                "\n  Graduation_rank  :  '" + graduation_rank + '\'' +
                "\n  Education  :  '" + education + '\'';
    }
}
