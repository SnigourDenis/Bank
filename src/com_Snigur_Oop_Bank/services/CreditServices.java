package com_Snigur_Oop_Bank.services;

import com_Snigur_Oop_Bank.interfaces.CreditInterface;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;

public class CreditServices extends AbstractServices implements CreditInterface{
    private String name;
    private String goodCreditStory;


    public CreditServices(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNameOfBank() {
        return null;
    }

    @Override
    public void getCredit(){

    }; //Кредит взят

    @Override
    public void repayCredit(){

    }

    @Override
    public DepartmentInterface getDepartment() {
        return null;
    }

    @Override
    public void setDepartment(DepartmentInterface department) {

    }

    ; //Кредит пога
}
