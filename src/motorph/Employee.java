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
    public double computeHoursWorked()
    {
        Duration duration = Duration.between(_timeIn, _timeOut);
        long minutes = duration.toMinutes();
        double hours = (double) minutes / 60;
        return hours;
    }
    
    // Compute Gross Salary method
    // Created a local variable "_totalHoursWorked" to get the value from "computeHoursWorked" method
    // Return value _totalHoursWorked * _hourlyRate
    public float basicPay()
    {
        return (float) (computeHoursWorked() * _hourlyRate);
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
        float basicPay = basicPay();
        float i = 1500;
        
        if (basicPay <= i)
        {
            return basicPay * 0.01f;
        }
        else if (basicPay > i)
        {
            return basicPay * 0.02f;
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
        float basicPay = basicPay();
        float premiumRate = 0.03f;
        float minimum = 10000f;
        float maximum = 60000f;
        float employeeShare = 0.5f;
        
        if (basicPay <= minimum)
        {
            return minimum * premiumRate * employeeShare;
        }
        else if (basicPay > minimum && basicPay < maximum)
        {
            return basicPay * premiumRate * employeeShare;
        }
        else if (basicPay >= maximum)
        {
            return  maximum * premiumRate * employeeShare;
        }
        else
        {
            return 0;
        }
    }
    
    // Compute SSS
    public float getSSS()
    {
        float _grossPay = basicPay();
        
        if (_grossPay < 3250f)
        {
            return 135f;
        }
        else if (_grossPay >= 3250f && _grossPay <= 3749.99f)
        {
            return 157.50f;
        }
        else if (_grossPay >= 3750f && _grossPay <= 4249.99f)
        {
            return 180f;
        }
        else if (_grossPay >= 4250f && _grossPay <= 4749.99f)
        {
            return 202.50f;
        }
        else if (_grossPay >= 4750f && _grossPay <= 5249.99f)
        {
            return 225f;
        }
        else if (_grossPay >= 5250f && _grossPay <= 5749.99f)
        {
            return 247.50f;
        }
        else if (_grossPay >= 5750f && _grossPay <= 6249.99f)
        {
            return 270f;
        }
        else if (_grossPay >= 6250f && _grossPay <= 6749.99f)
        {
            return 292.50f;
        }
        else if (_grossPay >= 6750f && _grossPay <= 7249.99f)
        {
            return 315f;
        }
        else if (_grossPay >= 7250f && _grossPay <= 7749.99f)
        {
            return 337.50f;
        }
        else if (_grossPay >= 7750f && _grossPay <= 8249.99f)
        {
            return 360f;
        }
        else if (_grossPay >= 8250f && _grossPay <= 8749.99f)
        {
            return 382.50f;
        }
        else if (_grossPay >= 8750f && _grossPay <= 9249.99f)
        {
            return 405.00f;
        }
        else if (_grossPay >= 9250f && _grossPay <= 9749.99f)
        {
            return 427.50f;
        }
        else if (_grossPay >= 9750f && _grossPay <= 10249.99f)
        {
            return 450f;
        }
        else if (_grossPay >= 10250f && _grossPay <= 10749.99f)
        {
            return 472.50f;
        }
        else if (_grossPay >= 10750f && _grossPay <= 11249.99f)
        {
            return 495f;
        }
        else if (_grossPay >= 11250f && _grossPay <= 11749.99f)
        {
            return 517.50f;
        }
        else if (_grossPay >= 11750f && _grossPay <= 12249.99f)
        {
            return 540f;
        }
        else if (_grossPay >= 12250f && _grossPay <= 12749.99f)
        {
            return 562.50f;
        }
        else if (_grossPay >= 12750f && _grossPay <= 13249.99f)
        {
            return 585f;
        }
        else if (_grossPay >= 13250f && _grossPay <= 13749.99f)
        {
            return 607.50f;
        }
        else if (_grossPay >= 13750f && _grossPay <= 14249.99f)
        {
            return 630f;
        }
        else if (_grossPay >= 14250f && _grossPay <= 14749.99f)
        {
            return 652.50f;
        }
        else if (_grossPay >= 14750f && _grossPay <= 15249.99f)
        {
            return 675f;
        }
        else if (_grossPay >= 15250f && _grossPay <= 15749.99f)
        {
            return 697.50f;
        }
        else if (_grossPay >= 15750f && _grossPay <= 16249.99f)
        {
            return 720f;
        }
        else if (_grossPay >= 16250f && _grossPay <= 16749.99f)
        {
            return 742.50f;
        }
        else if (_grossPay >= 16750f && _grossPay <= 17249.99f)
        {
            return 765f;
        }
        else if (_grossPay >= 17250f && _grossPay <= 17749.99f)
        {
            return 785.50f;
        }
        else if (_grossPay >= 17750f && _grossPay <= 18249.99f)
        {
            return 810f;
        }
        else if (_grossPay >= 18250f && _grossPay <= 18749.99f)
        {
            return 832.50f;
        }
        else if (_grossPay >= 18750f && _grossPay <= 19249.99f)
        {
            return 855f;
        }
        else if (_grossPay >= 19250f && _grossPay <= 19749.99f)
        {
            return 877.50f;
        }
        else if (_grossPay >= 19750f && _grossPay <= 20249.99f)
        {
            return 900f;
        }
        else if (_grossPay >= 20250f && _grossPay <= 20749.99f)
        {
            return 922.50f;
        }
        else if (_grossPay >= 20750f && _grossPay <= 21249.99f)
        {
            return 945f;
        }
        else if (_grossPay >= 21250f && _grossPay <= 21749.99f)
        {
            return 967.50f;
        }
        else if (_grossPay >= 21750f && _grossPay <= 22249.99f)
        {
            return 990f;
        }
        else if (_grossPay >= 22250f && _grossPay <= 22749.99f)
        {
            return 1012.50f;
        }
        else if (_grossPay >= 22750f && _grossPay <= 23249.99f)
        {
            return 1035f;
        }
        else if (_grossPay >= 23250f && _grossPay <= 23749.99f)
        {
            return 1057.50f;
        }
        else if (_grossPay >= 23750f && _grossPay <= 24249.99f)
        {
            return 1080f;
        }
        else if (_grossPay >= 24250f && _grossPay <= 24749.99f)
        {
            return 1102.50f;
        }
        else if (_grossPay > 24750f)
        {
            return 1125f;
        }
        else
        {
            return 0;
        }
    }
    
     // Taxable Income
     // Basic Pay - Deductions
     public float getTaxableIncome()  
        {
            return basicPay() - getPagibig() - getPhilhealth() - getSSS();
        }
    
     // Compute Withholding Tax
     public float getWithholdingTax()
     {
          float taxableIncome = getTaxableIncome();
         if (taxableIncome < 20833f)
         {
             return 0;
         }
         else if (taxableIncome >= 20833f && taxableIncome < 33333f)
         {
             return taxableIncome - 20833f * 0.20f;
         }
         else if (taxableIncome >= 33333f && taxableIncome < 66667f)
         {
             return taxableIncome - 33333 * 0.25f + 2500;
         }
         else if (taxableIncome >= 66667f && taxableIncome < 166667f)
         {
             return taxableIncome - 66667f * 0.30f + 10833;
         }
         else if (taxableIncome >= 166667f && taxableIncome < 666667f)
         {
             return taxableIncome - 166667f * 0.32f + 40833.33f;
         }
         else
         {
             return taxableIncome - 666667f * 0.35f + 200833.33f;
         }
         
     }
     
     // Compute Net Pay
     // Taxable Income - Withholding Tax
     public float getNetPay()
     {
         return getTaxableIncome() - getWithholdingTax() + _riceSubsidy + _phoneAllowance + _clothingAllowance;
     }
         
    
     
}
    
    
    
    
    

