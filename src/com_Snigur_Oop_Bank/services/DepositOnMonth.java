package com_Snigur_Oop_Bank.services;

import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;

public class DepositOnMonth extends AbstractServices {

    private double minAmountMoney;
    private float depositRate;

    public DepositOnMonth(String name) {
        super(name);
    }


    public DepositOnMonth(String name, double minAmountMoney, float depositRate) {
        super(name);
        this.minAmountMoney = minAmountMoney;
        this.depositRate = depositRate;
    }

    public double depositOnMonth(double getAmountMoney) {
        return  getAmountMoney + getAmountMoney * depositRate;
    }


    public float getDepositRate() {
        return depositRate;
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
}
