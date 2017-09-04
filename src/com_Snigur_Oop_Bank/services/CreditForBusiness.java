package com_Snigur_Oop_Bank.services;

public class CreditForBusiness extends CreditServices {

    private double sumCredit;
    private float creditRateForBusiness;


    public CreditForBusiness(String name) {
        super(name);
    }


    public void spendCredit(){
        System.out.println("Кредит потрачен!");
    }

}
