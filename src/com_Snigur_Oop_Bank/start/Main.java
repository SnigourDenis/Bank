package com_Snigur_Oop_Bank.start;

import com_Snigur_Oop_Bank.BankHall;
import com_Snigur_Oop_Bank.department.CreditDepartment;
import com_Snigur_Oop_Bank.department.MoneyExchangeDepartment;
import com_Snigur_Oop_Bank.employeers.Consultant;

public class Main {
    public static void main(String[] args) {imitateBankWorking();}

    private static void imitateBankWorking(){

        BankHall bankHall = new BankHall();
        Consultant consultant1 = new Consultant();

        CreditDepartment creditDepartment = new CreditDepartment();
        MoneyExchangeDepartment moneyExchangeDepartment = new MoneyExchangeDepartment();




    }

}
