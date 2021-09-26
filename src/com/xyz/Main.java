package com.xyz;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Ceo employee1 = new Ceo();
        String role1 = employee1.getRoleName();
        String responsiblity1 = employee1.getResponsibility();
        System.out.println("Employee 1 Role: "+ role1);
        System.out.println("Responsiblity: "+ responsiblity1);

        Manager employee2 = new Manager();
        String role2 = employee2.getRoleName();
        String responsiblity2 = employee2.getResponsibility();
        System.out.println("");
        System.out.println("Employee 2 Role: "+ role2);
        System.out.println("Responsiblity: "+ responsiblity2);


    }
}
