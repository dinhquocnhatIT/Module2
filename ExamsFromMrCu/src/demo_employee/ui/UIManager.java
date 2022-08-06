package demo_employee.ui;

import demo_employee.entity.Employee;
import demo_employee.entity.Experience;
import demo_employee.entity.Fresher;
import demo_employee.entity.Intern;
import demo_employee.exception.BirthDayException;
import demo_employee.exception.EmailException;
import demo_employee.exception.FullNameException;
import demo_employee.exception.PhoneException;
import demo_employee.service.EmployeeManager;
import demo_employee.service.ValidatorService;

import java.util.Scanner;

public class UIManager {
    private EmployeeManager employeeManager = new EmployeeManager();
    public void insert(int type){
        Employee employee = null;
        if (type == 0) {
            employee = insertExperience();
        }
        try{
            checkData(employee);
        } catch (BirthDayException e){
            insert(type);
        }catch (PhoneException e){
            insert(type);
        }catch (EmailException e) {
            insert(type);
        }catch (FullNameException e) {
            insert(type);
        }
        this.employeeManager.insert(employee);
    }
    //input experience info
    private Experience insertExperience(){
        Experience experience = new Experience();
        Scanner sc = ScannerFactory.getScanner();
        System.out.println("Input ID: ");
        String id = sc.nextLine();
        System.out.println("Input Name: ");
        String name = sc.nextLine();
        System.out.println("Input Phone:");
        String phone = sc.nextLine();
        System.out.println("Input Email:");
        String email = sc.nextLine();
        System.out.println("Input Exp In Year: ");
        String expYear = sc.nextLine();
        System.out.println("Input Pro Skill: ");
        String proSkill = sc.nextLine();
        return experience;
    }
    //input fresher info
    private Fresher insertFresher(){
        Fresher fresher = new Fresher();
        Scanner scanner = ScannerFactory.getScanner();
        System.out.println("Input ID: ");
        String id = scanner.nextLine();
        System.out.println("Input Name: ");
        String name = scanner.nextLine();
        System.out.println("Input Phone:");
        String phone = scanner.nextLine();
        System.out.println("Input Email:");
        String email = scanner.nextLine();
        System.out.println("Input Graduation Rank: ");
        String gradRank = scanner.nextLine();
        System.out.println("Input Education: ");
        String education = scanner.nextLine();
        return fresher;
    }
    //input intern info
    private Intern insertIntern(){
        Intern intern = new Intern();
        Scanner scanner = ScannerFactory.getScanner();
        System.out.println("Input ID: ");
        String id = scanner.nextLine();
        System.out.println("Input Name: ");
        String name = scanner.nextLine();
        System.out.println("Input Phone:");
        String phone = scanner.nextLine();
        System.out.println("Input Email:");
        String email = scanner.nextLine();
        System.out.println("Input majors: ");
        String majors = scanner.nextLine();
        System.out.println("Input Semester: ");
        String semester = scanner.nextLine();
        System.out.println("Input University Name: ");
        String UniversityName = scanner.nextLine();
        return intern;
    }
    //update
    private void update(){
        System.out.println("Input ID to update:");
        String id = ScannerFactory.getScanner().nextLine();
        Employee employee = this.employeeManager.findById(id);
    }
    //exception
    private void checkData(Employee employee) throws BirthDayException, PhoneException, EmailException, FullNameException {
        ValidatorService.birthDayCheck(employee.getBirthDay());
        ValidatorService.phoneCheck(employee.getPhone());
        ValidatorService.emailCheck(employee.getEmail());
        ValidatorService.nameCheck(employee.getFullName());

    }
}
