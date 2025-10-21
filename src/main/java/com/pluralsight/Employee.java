package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }

    public double getRegularHours(){
      if(hoursWorked > 40){
          return 40;
      } else {
          return hoursWorked;
      }
    }
    public double getOvertimeHours(){
        if(hoursWorked>40){
            return  hoursWorked - 40;
        } else{
            return 0;
        }
    }

    private double punchInTime = 0;

    public void  punchIn(double time){
       this.punchInTime = time;
    }

    public void punchIn(){
       LocalTime lt = LocalTime.now();
//       int hours =  lt.getHour();
//       int minutes = lt.getMinute();
//       double timeAsDouble = hours + ((double) minutes / 60);
//
        this.punchInTime = lt.getHour() + ((double) lt.getMinute() / 60); //this is the simplified version of this
    }

    public void punchOut(){
//LocalTime lt  = LocalTime.now();
       // double punchOutAsDouble = lt.getHour() + ((double) lt.getMinute() / 60);  // this way is easier to read
      //  this.hoursWorked += (float) (punchOutAsDouble - this.punchInTime);
        LocalTime lt  = LocalTime.now();
        this.hoursWorked += ((lt.getHour() + (double) lt.getMinute() / 60) - this.punchInTime); //this is good but takes longer to read not reccomended



    }
    public void punchOut(double time){
     // double elapsedTime = time - this.punchInTime;
     // this.hoursWorked += elapsedTime;

      this.hoursWorked += time - this.punchInTime; //always best to use th
    }

    public void punchTimeCard(double checkInTime, double checkOutTime){
        this.hoursWorked +=((checkInTime - checkOutTime));
    }
    public void logHours(float hours){
        this.hoursWorked += hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
