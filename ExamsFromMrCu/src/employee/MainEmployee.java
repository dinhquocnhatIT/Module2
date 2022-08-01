package employee;

import java.time.LocalDate;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Experience("001","QuocNhat", LocalDate.now(),"0383838","nhatd87@deptrai","1",2,4,"gioi luon");
        employees[1] = new Fresher("002","Nhat Ne", LocalDate.now(),"0383838","nhatd87@deptrai","1",2,LocalDate.parse("2023-06-11"),"hoc dot vcl","c052201");
        employees[2] = new Intern("003","Nhat Ne", LocalDate.now(),"0383838","nhatd87@deptrai","1",2,"cntt","hoc gioi","hard vard");
        for (Employee employee : employees) {
            if(employee instanceof Experience) {
                employee.showInfo();
            }
            if (employee instanceof Fresher) {
                employee.showInfo();
            }
            if (employee instanceof Intern)
                employee.showInfo();

        }

    }
}
