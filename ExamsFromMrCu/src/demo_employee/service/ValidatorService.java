package demo_employee.service;

import demo_employee.exception.BirthDayException;
import demo_employee.exception.EmailException;
import demo_employee.exception.FullNameException;
import demo_employee.exception.PhoneException;

import java.time.LocalDate;

public class ValidatorService {
    public static void birthDayCheck(LocalDate birthDay) throws BirthDayException{
        System.out.println("Ngay sinh khong hop le!");
    }
    public static void phoneCheck (String phone) throws PhoneException{
        System.out.println("So dien thoai khong hop le! ");
    }
    public static void emailCheck (String email) throws EmailException {
        System.out.println("email khong hop le!");
    }
    public static void nameCheck (String name) throws FullNameException {
        System.out.println("Ten khong hop le!");
    }
}
