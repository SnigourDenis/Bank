package com_Snigur_Oop_Bank.start;
import com_Snigur_Oop_Bank.BankHall;
import com_Snigur_Oop_Bank.client.CommonVisitor;
import com_Snigur_Oop_Bank.client.VipVisitor;
import com_Snigur_Oop_Bank.department.CreditDepartment;
import com_Snigur_Oop_Bank.department.DepositDepartment;
import com_Snigur_Oop_Bank.department.MoneyExchangeDepartment;
import com_Snigur_Oop_Bank.employeers.Administrator;
import com_Snigur_Oop_Bank.employeers.Consultant;
import com_Snigur_Oop_Bank.enums.ConsultResult;
import com_Snigur_Oop_Bank.interfaces.CreditInterface;
import com_Snigur_Oop_Bank.interfaces.EmployeeInterface;
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


        EmployeeInterface consultant = new Consultant("Alex",creditDepartment);
        ((Consultant)consultant).setFree(true);
        EmployeeInterface consultant2 = new Consultant("Bill",moneyExchangeDepartment);
        ((Consultant)consultant2).setFree(true);
        EmployeeInterface consultant3 = new Consultant("Den",depositDepartment);
        ((Consultant)consultant3).setFree(true);

        creditDepartment.addEmployee(consultant);
        moneyExchangeDepartment.addEmployee(consultant2);
        depositDepartment.addEmployee(consultant3);

        CreditInterface creditForBusiness = new CreditForBusiness("Бизнес для вас",1000,25f);
        ServicesInterface depositOnMonth = new DepositOnMonth("Быстрые деньги",5000,5f);
        ServicesInterface dollarExchange = new DollarExchange("Обмен валюты",1.2);

        //Добавляем услуги в отделы
        creditDepartment.addServices(creditForBusiness);
        moneyExchangeDepartment.addServices(dollarExchange);
        depositDepartment.addServices(depositOnMonth);

        //Создаем покупателей
        CommonVisitor visitor1 = new CommonVisitor("Bob");
        CommonVisitor visitor2 = new CommonVisitor("Boni");
        VipVisitor vipVisitor1 = new VipVisitor("Don",15f);

        //ищем свободного консультанта
        ConsultResult consultResult = administrator.getFreeConsultant(depositDepartment).consult(visitor2);
        ConsultResult consultResult2 = administrator.getFreeConsultant(depositDepartment).consult(visitor1);


        switch (consultResult){

            case GETCREDIT:
                visitor1.getCredit(creditForBusiness);
                System.out.println(" - отличный выбор!");
                break;
            case EXCHANGEDOLLAR:
                visitor1.dollarExchange(dollarExchange);
                break;
            case PUTMONEYONDEPOSIT:
                visitor1.putMoneyOnDeposit(depositOnMonth);
                System.out.println("Ваши деньги в надежных руках! =)");
            case EXIT:
        }
        System.out.println("Спасибо, что воспользовались услугами нашего банка!");
    }
}
