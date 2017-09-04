package com_Snigur_Oop_Bank.client;

import com_Snigur_Oop_Bank.interfaces.CreditInterface;
import com_Snigur_Oop_Bank.interfaces.ServicesInterface;
import com_Snigur_Oop_Bank.interfaces.VisitorInterface;
import com_Snigur_Oop_Bank.services.CreditForBusiness;
import com_Snigur_Oop_Bank.services.DepositOnMonth;

public abstract class AbstractVisitor implements VisitorInterface{
    private String name;
    private double amountMoneyNow;
    private double monthSalary;

    public AbstractVisitor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getCredit(CreditInterface credit) {
        System.out.println(credit.getName());
        if (credit instanceof CreditForBusiness){
            ((CreditForBusiness)credit).spendCredit();
        }
    }

    @Override
    public void dollarExchange(ServicesInterface services) {
        System.out.println(services.getName());
    }

    @Override
    public void putMoneyOnDeposit(ServicesInterface services) {
        System.out.println(services.getName());
    }
}
