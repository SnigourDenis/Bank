package com_Snigur_Oop_Bank.interfaces;

/**
 * Created by 1 on 31.08.2017.
 */
public interface VisitorInterface {

    void getCredit(CreditInterface credit);

    void dollarExchange(ServicesInterface services);

    void putMoneyOnDeposit(ServicesInterface services);

    String getName();
    }
