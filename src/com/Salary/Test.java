package com.Salary;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HourlyWorkers employee1 = new HourlyWorkers();
        int hour;
        System.out.println("Enter number of hours worker worked");
        hour = sc.nextInt();
        int salary = employee1.computePay(hour);
        System.out.println("Salary of Employee is : "+salary);

        SalariedWorker employee2 = new SalariedWorker();
        System.out.println("Enter number of hours worker worked");
        hour = sc.nextInt();
        salary = employee2.computePay(hour);
        System.out.println("Salary of Employee is : "+salary);

    }
}
