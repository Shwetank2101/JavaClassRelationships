package com.Salary;

public class SalariedWorker extends Worker {
    int perHourPaid = 200;
    String name;

    @Override
    public int computePay(int hours) {
        int salary = 0;
        salary = 40*perHourPaid;
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
