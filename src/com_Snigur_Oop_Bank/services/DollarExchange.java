package com_Snigur_Oop_Bank.services;

import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;
import com_Snigur_Oop_Bank.interfaces.ServicesInterface;

public class DollarExchange extends AbstractServices implements ServicesInterface {

    private double amountMoney;
    private double exchangeRate;

    public DollarExchange(String name, double exchangeRate) {
        super(name);
        this.exchangeRate = exchangeRate;
    }

    public double exchangeOfDollars(double amountMoney) {
        return amountMoney + amountMoney * 1.2;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getNameOfBank() {
        return super.getNameOfBank();
    }

    @Override
    public DepartmentInterface getDepartment() {
        return super.getDepartment();
    }

    @Override
    public void setDepartment(DepartmentInterface department) {

    }
}
