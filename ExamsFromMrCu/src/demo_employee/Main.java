package demo_employee;

import demo_employee.entity.Employee;
import demo_employee.entity.Experience;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Experience("1","dinhquocnhat", LocalDate.now(),"0389054366","nhatd87@gmail.com","list","10 nam","gioi luon");
        employee.toString();
    }
}
