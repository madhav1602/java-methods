import java.util.*;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        double[][] employeeData = new double[10][3]; 

        // Calling Methods
        initializeEmployees(employeeData);
        calculateBonus(employeeData);
        displayResults(employeeData);
    }

    // Method to initialize employees with random salary and years of service
    public static void initializeEmployees(double[][] employeeData) {
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = (int) (Math.random() * 50000) + 50000; 
            employeeData[i][1] = (int) (Math.random() * 11); 
        }
    }

    // Method to calculate bonus and new salary
    public static void calculateBonus(double[][] employeeData) {
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            employeeData[i][2] = bonus;
        }
    }

    // Method to display results in tabular format
    public static void displayResults(double[][] employeeData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("ID    Salary     Years      Bonus     New Salary");
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            double bonus = employeeData[i][2];
            double newSalary = oldSalary + bonus;
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            System.out.println((i + 1) + "    " + oldSalary + "    " + employeeData[i][1] + "        " + bonus + "    " + newSalary);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Total: " + totalOldSalary + "           " + totalBonus + "    " + totalNewSalary);
    }
}
