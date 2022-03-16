package com.bridgelabz;
//Employee Wage Computation Problems
import java.util.Random;
public class EmployeeWages
{

        public static void main(String[] args)
        {

            Random random = new Random();
            int empPresent = random.nextInt(2);
            System.out.println("Random Value for Employee is :" +empPresent);
            if (empPresent == 0)
            {
                System.out.println("Employee is Absent");
            } else
            {
                System.out.println("Employee is Present");
            }
        }
}

