package com.bridgelabz;
//Employee Wage Computation Problems
import java.util.Random;
public class EmployeeWages
{
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int EMP_FULL_TIME = 1;
    static final int EMP_PART_TIME = 2;
    static final int WORKING_DAY =20;

    public static void main(String[] args)
    {

        int empWage = 0;
        int totalwage = 0;

        for (int i = 0; i < WORKING_DAY; i++)
        {

            Random random = new Random();
            int empPresent = random.nextInt(3);
            System.out.println("Random Value for Employee Attendance is :" + empPresent);


            switch (empPresent)
            {
                case EMP_FULL_TIME:
                    empWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                    System.out.println("Employee is present and the wage is : " + empWage);
                    break;

                case EMP_PART_TIME:
                    empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    System.out.println("Employee is Part time present and the wage is : " + empWage);
                    break;

                default:
                    System.out.println("Employee is absent and the wage is : " + empWage);
                    break;

            }

            totalwage = totalwage + empWage;
            System.out.println("Total wage of employee for the month is : " + totalwage);

        }
    }
}

