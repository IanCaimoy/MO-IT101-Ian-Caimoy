/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph;
import java.time.LocalTime;
import java.time.Duration;

// This class contains the ff:
// Employee Details
// Employee Time in and Time out
// Calculate Hours Worked
// Calculate Gross Pay
 
public class Employee 
{
    // Declaration of Variables
    private String _employeeNo;
    private String _employeeFirstName;
    private String _employeeLastName;
    private String _date;
    private LocalTime _timeIn;
    private LocalTime _timeOut;
    private float _hourlyRate;
    private float _basicSalary;
    private float _riceSubsidy;
    private float _phoneAllowance;
    private float _clothingAllowance;
    
    
    // SETTER METHODS
    
    public void setEmployeeNo(String employeeNo)
    {
        _employeeNo = employeeNo;
    }
    
    public void setEmployeeFirstName(String employeeFirstName)
    {
        _employeeFirstName = employeeFirstName;
    }
    
    public void setEmployeeLastName(String employeeLastName)
    {
        _employeeLastName = employeeLastName;
    }
    
    public void setDate(String date)
    {
        _date = date;
    }
    
    public void setTimeIn(LocalTime timeIn)
    {
        _timeIn = timeIn;
    }
    
    public void setTimeOut(LocalTime timeOut)
    {
        _timeOut = timeOut;
    }
    
    public void setHourlyRate(float hourlyRate)
    {
        _hourlyRate = hourlyRate;
    }
    
    public void setBasicSalary(float basicSalary)
    {
        _basicSalary = basicSalary;
    }
    
    public void setRiceSubsidy(float riceSubsidy)
    {
        _riceSubsidy = riceSubsidy;
    }
    
    public void setPhoneAllowance(float phoneAllowance)
    {
        _phoneAllowance = phoneAllowance;
    }
    
    public void setClothingAllowance(float clothingAllowance)
    {
        _clothingAllowance = clothingAllowance;
    }
            
    
    // GETTER METHODS
    
    public String getEmployeeNo()
    {
        return _employeeNo;
    }
    public String getEmployeeFirstName()
    {
        return _employeeFirstName;
    }
    
    public String getEmployeeLastName()
    {
        return _employeeLastName;
    }
    
    public String getDate()
    {
        return _date;
    }
    
    public LocalTime getTimeIn()
    {
        return _timeIn;
    }
    
    public LocalTime getTimeout()
    {
        return _timeOut;
    }
    
    public float getHourlyRate()
    {
        return _hourlyRate;
    }
    
    public float getBasicSalary()
    {
        return _basicSalary;
    }
    
    public float getRiceSubsidy()
    {
        return _riceSubsidy;
    }
    
    public float getPhoneAllowance()
    {
        return _phoneAllowance;
    }
    
    public float getClothingAllowance()
    {
        return _clothingAllowance;
    }
    
    // Compute Hours Worked
    // using "between" method in Duration Class
    // Return _duration as hours
    public long computeHoursWorked()
    {
        Duration _duration = Duration.between(_timeIn, _timeOut);
        long hours = _duration.toHours();
        return hours;
    }
    
    // Compute Gross Salary method
    // Created a local variable "_totalHoursWorked" to get the value from "computeHoursWorked" method
    // Return value _totalHoursWorked * _hourlyRate
    public float basicPay()
    {
        float _totalHoursWorked = computeHoursWorked();
        return _totalHoursWorked * _hourlyRate;
    }
    
    // Compute Gross Pay
    public float grossPay()
    {
        return basicPay() + _riceSubsidy + _phoneAllowance + _clothingAllowance;
    }
    
    
    // THIS SECTION CONTAINS 
    // DEDUCTIONS
    // Withholding Tax
    
    // Compute PAGIBIG contribution
    // Getter Method + IF Statement
    public float computePagibigRate()
    {
        float basicSalary = getBasicSalary();
        float i = 1500;
        
        if (basicSalary <= i)
        {
            return basicSalary * 0.01f;
        }
        else if (basicSalary > i)
        {
            return basicSalary * 0.02f;
        }
        else
        {
            return 0;
        }
    }
        
    // Compute Max PAGIBIG Contribution    
    public float getPagibig()
    {
        if (computePagibigRate() < 99f)
        {
            return computePagibigRate();
        }
        else
        {
            return 100;
        }
    }
    
    
    // Compute Philhealth
    public float getPhilhealth()
    {
        float basicSalary = getBasicSalary();
        float premiumRate = 0.03f;
        float minimum = 10000f;
        float maximum = 60000f;
        float employeeShare = 0.5f;
        
        if (basicSalary <= minimum)
        {
            return minimum * premiumRate * employeeShare;
        }
        else if (basicSalary > minimum && basicSalary < maximum)
        {
            return basicSalary * premiumRate * employeeShare;
        }
        else if (basicSalary > maximum)
        {
            return  maximum * premiumRate * employeeShare;
        }
        else
        {
            return 0;
        }
    }
    
}
    
    
    
    
    

