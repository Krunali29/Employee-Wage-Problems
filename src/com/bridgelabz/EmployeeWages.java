package com.bridgelabz;
//Employee Wage Computation Problems
import java.util.Random;
public class EmployeeWages
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args)
    {

        Random random = new Random();
        int empPresent = random.nextInt(3);
        System.out.println("Random Value for Employee Attendance is :" +empPresent);

        int empWage = 0;
        int empFullTime = 1;
        int empPartTime = 2;

        if(empPresent == empFullTime)
        {
            empWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
            System.out.println("Employee is present and the wage is : "+empWage);
        }
        else if(empPresent == empPartTime)
        {
            empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employee is present and the wage is : "+empWage);
        }
        else
            System.out.println("Employee is absent and the wage is : "+empWage);

    }

}

