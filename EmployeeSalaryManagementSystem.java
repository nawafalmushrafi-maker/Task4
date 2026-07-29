package idea.project.Task4.Task4.Task4.Task4;
import java.util.ArrayList;

public class EmployeeSalaryManagementSystem {

    public static void main(String[] args) {

        // Create ArrayLists
        ArrayList<String> employeeNames = new ArrayList<>();
        ArrayList<Integer> employeeIds = new ArrayList<>();
        ArrayList<Double> employeeSalaries = new ArrayList<>();

        // Add employee data
        employeeIds.add(1001);
        employeeNames.add("Ali");
        employeeSalaries.add(850.0);

        employeeIds.add(1002);
        employeeNames.add("Nawaf");
        employeeSalaries.add(920.0);

        employeeIds.add(1003);
        employeeNames.add("Mohammed");
        employeeSalaries.add(1100.0);

        employeeIds.add(1004);
        employeeNames.add("salim");
        employeeSalaries.add(980.0);

        employeeIds.add(1005);
        employeeNames.add("Omar");
        employeeSalaries.add(1250.0);

        employeeIds.add(1006);
        employeeNames.add("Noor");
        employeeSalaries.add(890.0);

        employeeIds.add(1007);
        employeeNames.add("Hassan");
        employeeSalaries.add(1350.0);

        employeeIds.add(1008);
        employeeNames.add("Aisha");
        employeeSalaries.add(1050.0);

        employeeIds.add(1009);
        employeeNames.add("Khalid");
        employeeSalaries.add(1500.0);

        employeeIds.add(1010);
        employeeNames.add("Haithm");
        employeeSalaries.add(950.0);


        //  Display Employee Information
        System.out.println("Employee Information");
        System.out.println("--------------------");

        for (int i = 0; i < employeeIds.size(); i++) {
            IO.println("Employee " + i + ":");
            IO.println("ID: " + employeeIds.get(i));
            IO.println("Name: " + employeeNames.get(i));
            IO.println("Salary: " + employeeSalaries.get(i));
            IO.println();
        }


        // 4 Salary Category Analysis
        int highSalary = 0;
        int mediumSalary = 0;
        int lowSalary = 0;

        for (double salary : employeeSalaries) {

            if (salary > 1000) {
                highSalary++;
            } else if (salary >= 500) {
                mediumSalary++;
            } else {
                lowSalary++;
            }
        }

        IO.println("Salary Category Analysis");
        IO.println("High Salary Employees: " + highSalary);
        IO.println("Medium Salary Employees: " + mediumSalary);
        IO.println("Low Salary Employees: " + lowSalary);
        IO.println();


        //  Search Employee
        String searchInput = IO.readln("Enter employee ID: ");
        int searchId = Integer.parseInt(searchInput);

        boolean found = false;

        for (int i = 0; i < employeeIds.size(); i++) {

            if (employeeIds.get(i).equals(searchId)) {

                IO.println("Employee Found");
                IO.println("Name: " + employeeNames.get(i));
                IO.println("Salary: " + employeeSalaries.get(i));
                IO.println("Position: " + i);

                found = true;
                break;
            }
        }

        if (!found) {
            IO.println("Employee not found.");
        }


        //  Update Employee Salary
        String updateInput = IO.readln("Enter Employee Index: ");
        int updateIndex = Integer.parseInt(updateInput);

        String salaryInput = IO.readln("Enter New Salary: ");
        double newSalary = Double.parseDouble(salaryInput);


        if (updateIndex >= 0 && updateIndex < employeeSalaries.size()) {

            employeeSalaries.set(updateIndex, newSalary);

            System.out.println("Salary updated successfully.");
            System.out.println("ID: " + employeeIds.get(updateIndex));
            System.out.println("Name: " + employeeNames.get(updateIndex));
            System.out.println("Salary: " + employeeSalaries.get(updateIndex));

        } else {
            System.out.println("Invalid employee index.");
        }


        //  Remove Employee
        String removeInput = IO.readln("Remove Employee Index: ");
        int removeIndex = Integer.parseInt(removeInput);


        if (removeIndex >= 0 && removeIndex < employeeIds.size()) {

            employeeIds.remove(removeIndex);
            employeeNames.remove(removeIndex);
            employeeSalaries.remove(removeIndex);

            System.out.println("Employee removed successfully.");

        } else {
            System.out.println("Invalid employee index.");
        }


        // Display Updated List
        System.out.println("\nUpdated Employee List");
        System.out.println("---------------------");

        for (int i = 0; i < employeeIds.size(); i++) {

            System.out.println("Employee " + i);
            System.out.println("ID: " + employeeIds.get(i));
            System.out.println("Name: " + employeeNames.get(i));
            System.out.println("Salary: " + employeeSalaries.get(i));
            System.out.println();
        }


        //  Bonus Calculation
        System.out.println("Employee Salary Bonus Report");
        System.out.println("----------------------------");

        for (int i = 0; i < employeeNames.size(); i++) {

            double salary = employeeSalaries.get(i);
            double bonus;

            if (salary >= 1000) {
                bonus = salary * 0.10;
            } else if (salary >= 500) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double finalSalary = salary + bonus;

            System.out.println("Employee: " + employeeNames.get(i));
            System.out.println("Current Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Final Salary: " + finalSalary);
            System.out.println();
        }
    }
}
