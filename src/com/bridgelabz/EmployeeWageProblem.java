package com.bridgelabz;

public class EmployeeWageProblem {

        public static void Attendance() {

            int employeeCheck = (int) ( (Math.random() * 10 )% 2);//using random function

            if (employeeCheck == 1) {

                System.out.println("Employee is present");

            } else {

                System.out.println("Employee is absent");
            }



        }
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation");
        Attendance();
    }
}
