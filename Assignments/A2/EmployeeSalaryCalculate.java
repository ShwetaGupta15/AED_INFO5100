
import java.util.*;

public class EmployeeSalaryCalculate {

    // Assignment
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public static double socialSecurityTax(Employee employee) 
    {
        //write your code here
        double taxEmp;
        if(employee.salary <= 8900)
        {
            taxEmp = (6.2 * employee.salary)/100;
        } 
        else 
        {
            taxEmp = (6.2 * 106800)/100;
        }
        return taxEmp;

    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) 
    {
        //write your code here
        double insEmp = 0;
        int empAge = employee.age;
        double salEmp  = employee.salary;

        if(empAge<35)
            insEmp = (3 * salEmp)/100;
        else if (empAge>=35 && empAge<=50)
            insEmp = (4 * salEmp)/100;
        else if (empAge>50 && empAge<60)
            insEmp = (5 * salEmp)/100;
        else if (empAge>=60)
            insEmp = (6 * salEmp)/100;
        else
            System.out.println("Error salary values!");
        return insEmp;

    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
    */
    public static void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
        List<Employee> listEmp = new ArrayList<Employee>();
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);

        listEmp.sort(Comparator.comparing(Employee::getSalary));
        listEmp.forEach(Employee::getName);
        listEmp.forEach((Employee) -> {
            System.out.println(Employee.getName());
        });
    }
    
    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
    */
    public static void tripleSalary(Employee employee) {
        //write your code here

        double currSal = employee.getSalary();
        double raisedSal = 3*currSal;
        System.out.println("Raised Salary for " + employee.getName() + " is: $" + raisedSal);
    }
    
    public static void main(String[] args) 
    {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 8800);
        Employee b = new Employee("John", 30, Gender.MALE, 10000);
        Employee c = new Employee("Nick", 70, Gender.MALE, 15000);

        double sstaxEmpA = socialSecurityTax(a);
        double sstaxEmpB = socialSecurityTax(b);
        double sstaxEmpC = socialSecurityTax(c);

        double insEmpA = insuranceCoverage(a);
        double insEmpB = insuranceCoverage(b);
        double insEmpC = insuranceCoverage(c);


        // Calculate Final Salary

        System.out.println("Employee " + a.getName() + "'s Salary after Taxes and Insurance is : $" + (a.getSalary() - sstaxEmpA - insEmpA));
        System.out.println("Employee " + b.getName() + "'s Salary after Taxes and Insurance is : $" + (b.getSalary() - sstaxEmpB - insEmpB));
        System.out.println("Employee " + c.getName() + "'s Salary after Taxes and Insurance is : $" + (c.getSalary() - sstaxEmpC - insEmpC));
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        tripleSalary(a);
        tripleSalary(b);
        tripleSalary(c);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        sortSalary(a,b,c);
       
    }

    
}

//Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.

     Ans: The values are being changed in the Variables x & y. Since the swap method doesn't have a return type, the swap occurs there and not in
    the variables a & b. Java being a pass by value programming language, we are referencing a and b in x & y, swapping just x & y but not a & b. 
    */

    /*
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }

    */