/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Classes;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;


public class Main 
{

    public static void main(String[] args) 
    {
        // Scanner Instance
        Scanner strScanner = new Scanner(System.in);
        Scanner fltScanner = new Scanner(System.in);
        
        // Create an object from Employee class
        // Create an object from Deductions 
        Employee _employee = new Employee();        
        
        // Prompt User Input
        // Assign Values to Employee Setter Methods
        // Method Call
        System.out.print("Enter Employee No: ");
        _employee.setEmployeeNo(strScanner.nextLine());
        
        System.out.print("Enter Employee First Name: ");
        _employee.setEmployeeFirstName(strScanner.nextLine());
        
        System.out.print("Enter Employee Last Name: ");
        _employee.setEmployeeLastName(strScanner.nextLine());
         
        System.out.print("Enter Date[MM/DD/YYYY]: ");
        _employee.setDate(strScanner.nextLine());
        
        System.out.print("Enter Hourly Rate: ");
        _employee.setHourlyRate(fltScanner.nextFloat());      
        
        // Prompt "Time In" [HH:MM] format
        // Assign user input as a String variable
        // Parse the String Variable into LocalTime object
        // Assign the Localtime variable to the setter method parameter 
        System.out.print("Enter Time In[HH:MM]: ");
        String strTimeIn = strScanner.nextLine();
        LocalTime timeIn = LocalTime.parse(strTimeIn);
        _employee.setTimeIn(timeIn);
        
        
        // Prompt "Time Out" [HH:MM] format
        // Assign user input as a String variable
        // Parse the String Variable into LocalTime object
        // Assign the Localtime variable to the setter method parameter
        System.out.print("Enter Time Out[HH:MM]: ");
        String strTimeOut = strScanner.nextLine();
        LocalTime timeOut = LocalTime.parse(strTimeOut);
        _employee.setTimeOut(timeOut);
                
                       
        // Prompt Basic Salary and Allowances
        // Assingn values to setter methods
        System.out.print("Enter Monthly Basic Salary: ");
        _employee.setBasicSalary(fltScanner.nextFloat());
        System.out.print("Enter Rice Subsidy Amount: ");
        _employee.setRiceSubsidy(fltScanner.nextFloat());
        System.out.print("Enter Phone Allowance Amount: ");
        _employee.setPhoneAllowance(fltScanner.nextFloat());
        System.out.print("Enter Clothing Allowance Amount: ");
        _employee.setClothingAllowance(fltScanner.nextFloat());
        System.out.println();
        
        
        // Getter Method Call
        // Print Payslip
        System.out.println("P A Y S L I P");
        System.out.println("============================");
        System.out.println("Employee No: " + _employee.getEmployeeNo());
        System.out.println("Employee First Name: " + _employee.getEmployeeFirstName());
        System.out.println("Employee Last Name: " + _employee.getEmployeeLastName());
        System.out.println("============================");
        System.out.println();
        System.out.println("Date Worked: " + _employee.getDate());
        System.out.println("Total Hours Worked: " + _employee.computeHoursWorked());
        System.out.println("============================");
        System.out.println("BASIC PAY: " + _employee.basicPay());
        System.out.println();
        System.out.println("DE MINIMIS");
        System.out.println("Rice Subsidy: " + _employee.getRiceSubsidy());
        System.out.println("Phone Allowance: " + _employee.getPhoneAllowance());
        System.out.println("Clothing Allowance: " + _employee.getClothingAllowance());
        System.out.println("============================");
        System.out.println("GROSS PAY: " + _employee.grossPay());
        System.out.println();
        System.out.println("DEDUCTIONS");
        System.out.println("PAG-IBIG: " + _employee.getPagibig());
        System.out.println("Philhealth: " + _employee.getPhilhealth());
        System.out.println("SSS: " + _employee.getSSS());
        System.out.println("============================");
        System.out.println("Taxable Income: " + _employee.getTaxableIncome());
        System.out.println();
        System.out.println("(Less) Withholding Tax: " + _employee.getWithholdingTax());
        System.out.println("============================");
        System.out.println();
        System.out.println("NET PAY: " + _employee.getNetPay());
    }
    
}
