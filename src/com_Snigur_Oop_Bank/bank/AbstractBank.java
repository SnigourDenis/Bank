package com_Snigur_Oop_Bank.bank;

import com_Snigur_Oop_Bank.interfaces.BankInterface;

public abstract class AbstractBank implements BankInterface {
    public static int requetCount; //колличество заявок по всем банкам

    private String name;
    private String creditDescription;

    public AbstractBank() {
    }

    public AbstractBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    @Override
    public void chevkInfo() {
    requetCount++;
    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
