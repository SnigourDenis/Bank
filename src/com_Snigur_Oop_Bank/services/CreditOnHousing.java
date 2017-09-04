package com_Snigur_Oop_Bank.services;

import com_Snigur_Oop_Bank.interfaces.CreditInterface;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;

public class CreditOnHousing extends AbstractServices implements CreditInterface{

    private float creditRateForHousing;

    public CreditOnHousing(String name) {
        super(name);
    }

    @Override
    public void getCredit() {

    }

    @Override
    public void repayCredit() {

    }

    @Override
    public void setDepartment(DepartmentInterface department) {

    }
}
