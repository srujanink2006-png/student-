import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String designation;
    double basicSalary;
    double hra, da, grossSalary, netSalary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void calculateSalary() {
        hra = basicSalary * 0.20;   // 20% HRA
        da = basicSalary * 0.10;    // 10% DA

        grossSalary = basicSalary + hra + da;
        netSalary = grossSalary;    // No deductions
    }

    void generatePayslip() {
        System.out.println("\n========== EMPLOYEE PAYSLIP ==========");
        System.out.println("Employee ID      : " + empId);
        System.out.println("Employee Name    : " + empName);
        System.out.println("Designation      : " + designation);
        System.out.println("--------------------------------------");
        System.out.println("Basic Salary     : ₹" + basicSalary);
        System.out.println("HRA (20%)        : ₹" + hra);
        System.out.println("DA (10%)         : ₹" + da);
        System.out.println("--------------------------------------");
        System.out.println("Gross Salary     : ₹" + grossSalary);
        System.out.println("Net Salary       : ₹" + netSalary);
        System.out.println("======================================");
    }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.getDetails();
        emp.calculateSalary();
        emp.generatePayslip();
    }
}