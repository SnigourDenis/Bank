package com_Snigur_Oop_Bank.start;

import com_Snigur_Oop_Bank.BankHall;
import com_Snigur_Oop_Bank.department.CreditDepartment;
import com_Snigur_Oop_Bank.department.DepositDepartment;
import com_Snigur_Oop_Bank.department.MoneyExchangeDepartment;
import com_Snigur_Oop_Bank.employeers.Administrator;
import com_Snigur_Oop_Bank.employeers.Consultant;
import com_Snigur_Oop_Bank.interfaces.CreditInterface;
import com_Snigur_Oop_Bank.interfaces.ServicesInterface;
import com_Snigur_Oop_Bank.services.*;

public class Main {
    public static void main(String[] args) {imitateBankWorking();}

    private static void imitateBankWorking(){

        BankHall bankHall = new BankHall();
        Administrator administrator = new Administrator(bankHall);

        CreditDepartment creditDepartment = new CreditDepartment();
        MoneyExchangeDepartment moneyExchangeDepartment = new MoneyExchangeDepartment();
        DepositDepartment depositDepartment = new DepositDepartment();

        bankHall.addDepartment(creditDepartment);
        bankHall.addDepartment(moneyExchangeDepartment);
        bankHall.addDepartment(depositDepartment);

        Consultant consultant = new Consultant("Alex",creditDepartment);
        consultant.setFree(true);
        Consultant consultant2 = new Consultant("Bill",moneyExchangeDepartment);
        consultant2.setFree(true);
        Consultant consultant3 = new Consultant("Den",depositDepartment);
        consultant3.setFree(true);

        creditDepartment.addEmployee(consultant);
        moneyExchangeDepartment.addEmployee(consultant2);
        depositDepartment.addEmployee(consultant3);


        CreditInterface creditForBusiness = new CreditForBusiness("Бизнес для вас",1000,25f);
        ServicesInterface depositOnMonth = new DepositOnMonth("Быстрые деньги",5000,5f);
        ServicesInterface dollarExchange = new DollarExchange("Обмен валюты",1.2);






    }

}
