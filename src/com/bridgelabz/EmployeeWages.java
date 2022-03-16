package com.bridgelabz;
//Employee Wage Computation Problems
import java.util.Random;
public class EmployeeWages
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args)
    {
        Random random = new Random();
        int empPresent = random.nextInt(2);
        System.out.println("Random Value for Employee is :" +empPresent);

        int empWage = 0;
        if (empPresent == 0)
        {
            System.out.println("Employee is Absent");
        } else
        {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is Present");
        }
        System.out.println("Employee Wage:"+empWage);
    }

}

