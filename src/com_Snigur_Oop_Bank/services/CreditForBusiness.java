package com_Snigur_Oop_Bank.services;

public class CreditForBusiness extends CreditServices {

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

}
