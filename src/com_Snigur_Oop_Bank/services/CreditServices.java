package com_Snigur_Oop_Bank.services;

import com_Snigur_Oop_Bank.interfaces.CreditInterface;
import com_Snigur_Oop_Bank.interfaces.DepartmentInterface;

public class CreditServices  implements CreditInterface{
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
    public void getCredit(){

    }; //Кредит взят

    @Override
    public void repayCredit(){

    }; //Кредит пога
}
