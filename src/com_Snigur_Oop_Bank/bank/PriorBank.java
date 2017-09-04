package com_Snigur_Oop_Bank.bank;

public class PriorBank extends AbstractBank {

    public PriorBank() {
    }

    public PriorBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void chevkInfo() {
        super.chevkInfo();
    }

    @Override
    public void giveCredit() {
        super.giveCredit();
    }

    public void chevkInfo(boolean critical){
        System.out.println("PriorBank");

    }

}
