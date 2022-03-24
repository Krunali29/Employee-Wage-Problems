package com.bridgelabz;
//Employee Wage Computation Problems Using OOPS Concept
//Ability To Save Total Wage For Each Company
public class EmployeeWages
{
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    final String companyName;
    final int empRatePerHour;
    final int numOfWorkingDays;
    final int maxHoursPerMonth;
    int totalEmpWage;

    public EmployeeWages(String companyName, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage()
    {
        //variables
        int empHrs = 0,totalEmpHrs = 0, totalWorkingDays = 0;

        //Computation
        while (totalEmpHrs <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;



    }

    public String toString() {
        return "Total Emp Wage for Company: " + companyName +" is: " + totalEmpWage;
    }
    public static void main(String[] args) {

        EmployeeWages dMart = new EmployeeWages("D-Mart", 20, 20, 100);
        EmployeeWages reliance = new EmployeeWages("Amazon", 10, 10, 100);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}

