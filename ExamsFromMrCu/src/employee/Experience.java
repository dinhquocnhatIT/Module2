package employee;

import java.time.LocalDate;

public class Experience extends Employee{
    private int expInYear;
    private String proSkill;
    Experience() {}
    Experience(int expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }


        public Experience(String id, String fullName, LocalDate birthDay, String phone, String email, String employee_type, int employee_count, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employee_type, employee_count);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience Employee------ " +
                super.toString() +
                "\n  Exp In Year  :  " + expInYear +
                "\n  Pro Skill  :  '" + proSkill + '\'';
    }
}
