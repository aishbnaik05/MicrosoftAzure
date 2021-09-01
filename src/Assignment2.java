import java.util.Scanner;

class Member
{
    String name;
    int age;
    String phoneNumber;
    String Address;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class Employee extends Member
{
    String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
class Manager extends Member
{
    String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee employee = new Employee();
        Manager manager = new Manager();
        System.out.println("Enter name of an Employee");
        employee.setName(s.next());
        System.out.println("Enter age of an Employee");
        employee.setAge(s.nextInt());
        System.out.println("Enter address of an Employee");
        employee.setAddress(s.next());
        System.out.println("Enter phone number of an Employee");
        employee.setPhoneNumber(s.next());
        System.out.println("Enter Salary of an Employee");
        employee.setSalary(s.nextInt());
        System.out.println("Enter Specialization of an Employee");
        employee.setSpecialization(s.nextLine());
        System.out.println("salary of " + employee.getName() +":" +employee.getSalary());

//        Manager details
        System.out.println("Enter name of Manager");
        manager.setName(s.nextLine());
        System.out.println("Enter age of Manager");
        manager.setAge(s.nextInt());
        System.out.println("Enter address of Manager");
        manager.setAddress(s.next());
        System.out.println("Enter phone number of Manager");
        manager.setPhoneNumber(s.next());
        System.out.println("Enter Salary of Manager");
        manager.setSalary(s.nextInt());
        System.out.println("Enter department of Manager");
        manager.setDepartment(s.nextLine());
        System.out.println("salary of " + manager.getName() +":" +manager.getSalary());

    }
}
