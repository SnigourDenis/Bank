package com_Snigur_Oop_Bank.services;

import com_Snigur_Oop_Bank.interfaces.CreditInterface;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;

public class CreditForBusiness extends AbstractServices implements CreditInterface {

    private double minSumCredit;
    private float creditRateForBusiness;


    public CreditForBusiness(String name) {
        super(name);
    }

    public CreditForBusiness(String name, double minSumCredit, float creditRateForBusiness) {
        super(name);
        this.minSumCredit = minSumCredit;
        this.creditRateForBusiness = creditRateForBusiness;
    }

    public void spendCredit(){
        System.out.println("Кредит потрачен!");
    }

    @Override
    public String getNameOfBank() {
        return null;
    }

    @Override
    public void getCredit() {

    }

    @Override
    public void repayCredit() {

    }

    @Override
    public DepartmentInterface getDepartment() {
        return null;
    }

    @Override
    public void setDepartment(DepartmentInterface department) {

    }
}
