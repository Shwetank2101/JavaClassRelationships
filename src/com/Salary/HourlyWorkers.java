package com.Salary;

public class HourlyWorkers extends Worker{
    int perHourPaid = 200;
    String name;

    @Override
    public int computePay(int hours) {
        int salary = 0;
        if(hours<=40){
            salary = (int)(hours*perHourPaid);
        }
        else{
            salary = (int) ((hours-40)*perHourPaid*0.5 + 40*perHourPaid);
        }
        return salary*7;
    }

    public int getPerHourPaid() {
        return perHourPaid;
    }

    public void setPerHourPaid(int perHourPaid) {
        this.perHourPaid = perHourPaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
